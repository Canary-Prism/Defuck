package canaryprism.brainfuck.optimising;

import static canaryprism.brainfuck.optimising.FlowInterpreter.OptimisedCollapsedInstruction.OptimisedInstruction.*;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;

public class FlowInterpreter extends CollapsingInterpreter {

    private ArrayList<OptimisedCollapsedInstruction> optimised_code;

    public FlowInterpreter(String code) {
        super(code);
    }
    
    @Override
    public void optimise() {
        super.optimise(); 

        optimised_code = new ArrayList<OptimisedCollapsedInstruction>(); 

        optimised_code.add(new OptimisedCollapsedInstruction(none, 0, 0));

        for (int i = 0; i < collapsed_code.size(); i++) {
            var here = collapsed_code.get(i);
            var instruction = switch (here.instruction()) {
                case jump -> jump;
                case end -> end;
                case in -> in;
                case move -> move;
                case out -> out;
                case plus -> plus;
            };

            optimised_code.add(new OptimisedCollapsedInstruction(instruction, here.a(), here.b()));
        }

        optimised_code.add(new OptimisedCollapsedInstruction(none, 0, 0));

        simplify(1, optimised_code.size() - 1);

        //let's bind some sets :D
        //this one nukes pluses and sets infront of the set
        for (int i = optimised_code.size() - 1; i > 0; i--) {
            if (optimised_code.get(i).instruction() == set) {
                for (int v = i - 1; v > 0
                                    && (optimised_code.get(v).instruction() == set 
                                    || optimised_code.get(v).instruction() == plus
                                    || optimised_code.get(v).instruction() == none); v--) {
                    optimised_code.set(v, new OptimisedCollapsedInstruction(none, 0, 0));
                }
            }
        }
        //this one binds to plusses after and changes its own set value
        for (int i = 0; i < optimised_code.size(); i++) {
            if (optimised_code.get(i).instruction() == set) {
                var amount = 0;
                for (int v = i + 1; optimised_code.get(v).instruction() == plus || optimised_code.get(v).instruction() == none; v++) {
                    amount += optimised_code.get(v).a();
                    optimised_code.set(v, new OptimisedCollapsedInstruction(none, 0, 0));
                }

                optimised_code.set(i, new OptimisedCollapsedInstruction(set, (optimised_code.get(i).a() + amount) % 256, 0));
            }
        }
        //if a set 0 or negative jump or findzero happens before a positive jump or findzero, nuke the entire loop
        for (int i = 0; i < optimised_code.size() - 2; i++) {
            if ((optimised_code.get(i).instruction() == set && optimised_code.get(i).a() == 0)
                || (optimised_code.get(i).instruction() == jump && optimised_code.get(i).a() == 0)
                || (optimised_code.get(i).instruction() == findzero)) {
                i++;
                while (optimised_code.get(i).instruction() == none)
                    i++;
                if ((optimised_code.get(i).instruction() == jump)
                    && optimised_code.get(i).b() == 0) {
                    var end = optimised_code.get(i).a();
                    System.out.println(end);
                    for (int v = i; v <= i + end; v++) {
                        optimised_code.set(v, new OptimisedCollapsedInstruction(none, 0, 0));
                    }
                } else if (optimised_code.get(i).instruction() == findzero) {
                    optimised_code.set(i, new OptimisedCollapsedInstruction(none, 0, 0));
                }
            }
        }

        //get rid of the nones bc they're really annoying and we don't need them anymore
        compressNone();
    }

    private void simplify(int from, int to) {

        //if there are loops within this loop they need to be simplified first
        for (int i = from; i < to; i++) {
            var here = optimised_code.get(i);
            if (here.instruction() == jump && here.a() != 0) {
                simplify(i + 1, i + here.a());
            }
        }

        //if there are still loops or IO side-effects then this loop cannot be simplified
        for (int i = from; i < to; i++) 
            switch (optimised_code.get(i).instruction()) {
                case jump, in, out, set, findzero, transfer -> { return; }
                default -> {}
            }

        

        //sees if this is a setzero
        var has_moves = false;
        var move_total = 0;
        var has_pluses = false;
        
        for (int i = from; i < to; i++) {
            switch (optimised_code.get(i).instruction()) {
                case move -> {
                    has_moves = true;
                    move_total += optimised_code.get(i).a();
                }
                case plus -> {
                    has_pluses = true;
                }
                case jump, in, out, set, findzero, transfer -> throw new Error();
                case none, end -> {}
            }
        }

        if (has_moves && has_pluses) {
            if (move_total == 0) {
                var map = new HashMap<Integer, Integer>();
                var pointer = 0;
                map.put(0, 0);
                for (int i = from; i < to; i++) {
                    var here = optimised_code.get(i);
                    switch (here.instruction()) {
                        case move -> {
                            pointer += here.a();
                            map.putIfAbsent(pointer, 0);
                        }
                        case plus -> {
                            map.put(pointer, map.get(pointer) + here.a());
                        }
                        default -> {}
                    }
                }
                if (map.get(0) == -1) {
                    for (int i = from - 1; i <= to; i++) {
                        optimised_code.set(i, new OptimisedCollapsedInstruction(none, 0, 0));
                    }

                    int v = from - 1;

                    for (var key : map.keySet()) {
                        if (key != 0 && map.get(key) != 0) {
                            optimised_code.set(v, new OptimisedCollapsedInstruction(transfer, key, map.get(key)));
                            v++;
                        }
                    }

                    optimised_code.set(v, new OptimisedCollapsedInstruction(set, 0, 0));

                    return;
                }
            }
            return;
        }

        //nuke everything >:D
        for (int i = from - 1; i <= to; i++) {
            optimised_code.set(i, new OptimisedCollapsedInstruction(none, 0, 0));
        }

        if (!has_moves && has_pluses) {
            optimised_code.set(from - 1, new OptimisedCollapsedInstruction(set, 0, 0));
        }
        if (!has_pluses && has_moves) {
            optimised_code.set(from - 1, new OptimisedCollapsedInstruction(findzero, move_total, 0));
        }
    }

    /**
     * probably the least efficient part of the entire thing
     */
    private void compressNone() {
        var noneless = new ArrayList<OptimisedCollapsedInstruction>();

        compressNone(noneless, 0, optimised_code.size());

        optimised_code.clear();
        optimised_code.addAll(noneless);
    }

    private void compressNone(ArrayList<OptimisedCollapsedInstruction> noneless, int from, int to) {
        for (int i = from; i < to; i++) {
            var here = optimised_code.get(i);
            switch (here.instruction()) {
                case plus, move, in, out, set, findzero, transfer, end -> noneless.add(here);
                case jump -> {
                    var a = i;
                    var opening = noneless.size();
                    noneless.add(null);

                    i += here.a();

                    compressNone(noneless, a + 1, i);

                    noneless.set(opening, new OptimisedCollapsedInstruction(jump, noneless.size() - opening, 0));

                    noneless.add(new OptimisedCollapsedInstruction(jump, 0, noneless.size() - opening));

                }
                case none -> {}
            }
        }
    }

    @Override
    public void execute(InputStream in, OutputStream out) throws IOException {
         
        int[] memory = new int[60_000];
        int pointer = 30_000;

        for (int i = 0; i < optimised_code.size(); i++) {
            var here = optimised_code.get(i);
            switch (here.instruction()) {
                case plus -> memory[pointer] = (memory[pointer] + here.a) & 255;
                case jump -> {
                    if (memory[pointer] == 0) {
                        i += here.a;
                    } else {
                        i -= here.b;
                    }
                }
                case move -> pointer += here.a;
                case out -> out.write(memory[pointer]);
                case in -> memory[pointer] = in.read() & 255;
                case end -> {
                    return;
                }
                case findzero -> {
                    while (memory[pointer] != 0) {
                        pointer += here.a;
                    }
                }
                case none -> System.err.println("WARNING! Wasted instruction cycle in FlowInterpreter!");
                case set -> memory[pointer] = here.a;
                case transfer -> memory[pointer + here.a] = (memory[pointer + here.a] + memory[pointer] * here.b) & 255;
            }
        }
    }

    private int memory_cursor = 0;
    private int memory_window = 30000;
    private int last_pointer = 30000;

    @SuppressWarnings("unused")
    private void log(int[] memory, int pointer, int code_pointer) {
        var thirty = 30;

        if (pointer > last_pointer) {
            memory_cursor = Math.min(30, memory_cursor + pointer - last_pointer);

            memory_window = pointer - last_pointer - 30;
        } else if (pointer < last_pointer) {
            memory_cursor = Math.max(0, memory_cursor + pointer - last_pointer);

            memory_window = pointer - last_pointer - 30;
        }

        last_pointer = pointer;



        var memory_builder = new StringBuilder().append("[...|");
        for (var i = Math.max(memory_window, 0); i < Math.min(memory_window + thirty, memory.length); i++) {
            memory_builder.append(String.format("%3d|", memory[i]));
        }
        memory_builder.append("...]");


        System.out.println(STR."""
                Code Pointer: \{code_pointer}
                Memory: At Position \{pointer}
                \{memory_builder.toString()}
                \{"    ".repeat(memory_cursor)}      ^
                """);

        // try {
        //     Thread.sleep(1);
        // } catch (InterruptedException e) {
        // }
    }

    public String getOptimisedCodeString() {
        return optimised_code.stream()
                .map(OptimisedCollapsedInstruction::toString)
                .reduce("", String::concat);
    }

    @SuppressWarnings("unchecked")
    public ArrayList<OptimisedCollapsedInstruction> getOptimisedCode() {
        return (ArrayList<OptimisedCollapsedInstruction>)optimised_code.clone();
    }
    
    public record OptimisedCollapsedInstruction(OptimisedInstruction instruction, int a, int b) {
        /**
         * omits minus and left
         * adds condensed instructions
         */
        public enum OptimisedInstruction {
            plus, jump, move, out, in, end, set, findzero, transfer, none;

            public char toChar() {
                return switch (this) {
                    case plus -> '+';
                    case jump -> '[';
                    case move -> '>';
                    case out -> '.';
                    case in -> ',';
                    case end -> ';';
                    case findzero -> '?';
                    case set -> '=';
                    case transfer -> '^';
                    case none -> '_';
                };
            }
        }

        @Override
        public String toString() {
            return switch (instruction) {
                case out, in, end, none -> " " + instruction.toChar();
                case jump -> (b == 0) ? STR." [\{a}" : STR." \{b}]";
                case transfer -> " " + instruction.toChar() + a + '|' + b;
                default -> " " + instruction.toChar() + a;
            };
        }
    }
}
