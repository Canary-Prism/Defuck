package canaryprism.brainfuck.defuck.java;

import static java.lang.StringTemplate.STR;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Stack;

import org.apache.commons.text.StringEscapeUtils;

import canaryprism.brainfuck.defuck.Transpiler;
import canaryprism.brainfuck.optimising.FlowInterpreter;
import canaryprism.brainfuck.optimising.FlowInterpreter.OptimisedCollapsedInstruction;
import canaryprism.brainfuck.optimising.FlowInterpreter.OptimisedCollapsedInstruction.OptimisedInstruction;
import canaryprism.writers.SourcecodeWriterJava;

//FIXME: doens't work yet
public class StateTranspilerJava extends FlowTranspilerJava {

    protected ArrayList<StateInstruction> state_optimised_code;


    /**
     * broken, pls don't use it
     */
    @Deprecated
    public StateTranspilerJava(String code) {
        super(code);
    }

    @Override
    protected void transpile() {
        super.transpile();

        ArrayList<OptimisedCollapsedInstruction> max_static_code = new ArrayList<>();
        state_optimised_code = new ArrayList<>();

        var memory = new int[60_000];
        var runtime = new boolean[60_000];
        var pointer = 30_000;
        var unknown_pointer = false;
        var back_jump = new Stack<BackJump>();
        back_jump.push(null);
        var runtime_pointer = 30_000;


        for (int i = 0; i < flow_code.size(); i++) {
            var here = flow_code.get(i);
            switch (here.instruction()) {
                case plus -> {
                    if (runtime[pointer] || unknown_pointer)
                        max_static_code.add(here);
                    else
                        memory[pointer] = (memory[pointer] + here.a()) & 255;
                }
                case move -> {
                    pointer += here.a();
                    if (unknown_pointer) {
                        max_static_code.add(here);
                    }
                }
                case jump -> {
                    if (here.a() != 0) {
                        if (runtime[pointer] || unknown_pointer) {
                            if (pointer != runtime_pointer) {
                                max_static_code.add(new OptimisedCollapsedInstruction(OptimisedInstruction.move, 0, pointer));
                                runtime_pointer = pointer;
                            }
                            back_jump.push(new BackJump(max_static_code.size(), pointer, true));
                            max_static_code.add(null);
                        } else {
                            max_static_code.add(new OptimisedCollapsedInstruction(OptimisedInstruction.set, memory[pointer], 0));
                            if (memory[pointer] != 0) {
                                back_jump.push(new BackJump(max_static_code.size(), pointer, false));
                                max_static_code.add(null);
                            } else {
                                i += here.a();
                            }
                        }
                    } else {
                        if (runtime[pointer] || unknown_pointer || back_jump.peek().runtime) {
                            var back = back_jump.pop();
                            max_static_code.set(back.index, new OptimisedCollapsedInstruction(OptimisedInstruction.jump, 1, 0));
                            if (pointer != back.pointer)
                                unknown_pointer = true;
                            else {
                                runtime[pointer] = false;
                                memory[pointer] = 0;
                            }
                            max_static_code.add(here);
                        } else {
                            if (memory[pointer] != 0) {
                                i -= here.b();
                            } else {
                                var back = back_jump.pop();
                                max_static_code.remove(back.index);
                                max_static_code.remove(back.index - 1);
                            }
                        }
                    }
                }
                case out -> {
                    if (runtime[pointer] || unknown_pointer) {
                        if (pointer != runtime_pointer) {
                            max_static_code.add(new OptimisedCollapsedInstruction(OptimisedInstruction.move, 0, pointer));
                            runtime_pointer = pointer;
                        }
                        max_static_code.add(here);
                    } else {
                        max_static_code.add(new OptimisedCollapsedInstruction(OptimisedInstruction.out, memory[pointer], -1));
                        System.out.print((char)memory[pointer]);
                    }
                }
                case in -> {
                    if (!unknown_pointer)
                        max_static_code.add(new OptimisedCollapsedInstruction(OptimisedInstruction.move, 0, pointer));
                    max_static_code.add(here);
                    runtime[pointer] = true;
                }
                case end -> {
                    break;
                }
                case findzero -> {
                    var old_pointer = pointer;
                    var is_runtime = false;
                    while (pointer + here.a() >= 0 
                            && pointer + here.a() < 60_000
                            && memory[pointer] != 0) {

                        if (!is_runtime)
                            is_runtime = runtime[pointer];

                        pointer += here.a();
                    }

                    if (is_runtime || unknown_pointer) {
                        max_static_code.add(here);
                        unknown_pointer = true;
                        pointer = old_pointer;
                    }
                }
                case none -> System.err.println("WARNING! Wasted instruction cycle in FlowInterpreter!");
                case set -> {
                    if (unknown_pointer) {
                        max_static_code.add(here);
                    } else {
                        memory[pointer] = here.a();
                        if (runtime[pointer]) {
                            max_static_code.add(here);
                            runtime[pointer] = false;
                        }
                    }
                }
                case transfer -> {
                    if (unknown_pointer || runtime[pointer]) {
                        max_static_code.add(here);
                        runtime[pointer + here.a()] = runtime[pointer] || runtime[pointer + here.a()];
                    } else {
                        if (runtime[pointer + here.a()]) {
                            max_static_code.add(new OptimisedCollapsedInstruction(OptimisedInstruction.transfer, 0, memory[pointer] * here.b()));
                        }
                        memory[pointer + here.a()] = (memory[pointer + here.a()] + memory[pointer] * here.b()) & 255;
                    }
                }
            }
        }


        for (int i = 0; i < max_static_code.size(); i++) {
            var here = max_static_code.get(i);
            switch (here.instruction()) {
                case out -> {
                    if (here.b() == -1) {
                        var n = i + 1;
                        var str = String.valueOf((char)here.a());
                        while (n < max_static_code.size() && max_static_code.get(n).instruction() == OptimisedInstruction.out && max_static_code.get(n).b() == -1) {
                            n++;
                        }
                        for (i++; i < n; i++) {
                            str += (char)max_static_code.get(i).a();
                        }
                        state_optimised_code.add(new StateInstruction(OptimisedInstruction.out, -1, -1, str));
                    } else {
                        state_optimised_code.add(new StateInstruction(OptimisedInstruction.out, here.a(), here.b(), null));
                    }
                }
                default -> 
                    state_optimised_code.add(new StateInstruction(here.instruction(), here.a(), here.b(), null));
            }
        }
    }

    @Override
    @SuppressWarnings("resource")
    public void write(OutputStream out) throws IOException {
        try (var wr = new SourcecodeWriterJava(out)) {
            wr
                .startClass("Main")
                    .psvm("Throwable")
                        .code("var memory = new int[60_000];")
                        .code("var pointer = 30_000;");

            for (var e : state_optimised_code) {
                switch (e.instruction()) {
                    case plus -> wr.code(STR."memory[pointer] = (memory[pointer] + \{e.a()}) & 255;");
                    case jump -> {
                        if (e.a() != 0) {
                            wr.startWhile("memory[pointer] != 0");
                        } else {
                            wr.endWhile();
                        }
                    }
                    case move -> {
                        if (e.a() == 0)
                            wr.code(STR."pointer = \{e.b()};");
                        else
                            wr.code(STR."pointer += \{e.a()};");
                    }
                    case in -> wr.code("memory[pointer] = System.in.read() & 255;");
                    case out -> {
                        if (e.b() == -1)
                            wr.code(STR."System.out.print(\"\{StringEscapeUtils.escapeJava(e.str())}\");");
                        else
                            wr.code("System.out.write((char)memory[pointer]);");
                    }
                    case findzero -> wr
                        .startWhile("memory[pointer] != 0")
                            .code(STR."pointer += \{e.a()};")
                        .endWhile();
                    case set -> wr.code(STR."memory[pointer] = \{e.a()};");
                    case transfer -> {
                        if (e.a != 0)
                            wr.code(STR."memory[pointer + \{e.a()}] = (memory[pointer + \{e.a()}] + memory[pointer] * \{e.b()}) & 255;");
                        else
                            wr.code(STR."memory[pointer + \{e.a()}] = (memory[pointer + \{e.a()}] + \{e.b()}) & 255;");
                    }
                    case end -> wr.code("return;");
                    case none -> wr.code("// WARNING: none written to sourcecode here");
                }
            }

            wr
                        .code("System.out.flush();")
                    .endMethod()
                .endClass();
        } 
    }

    public record StateInstruction(OptimisedInstruction instruction, int a, int b, String str) {

    }


    public record BackJump(int index, int pointer, boolean runtime) {

    }
}
