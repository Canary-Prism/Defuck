package canaryprism.brainfuck.defuck.java;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;

import canaryprism.brainfuck.defuck.Decompiler;
import canaryprism.brainfuck.optimising.FlowInterpreter;
import canaryprism.brainfuck.optimising.FlowInterpreter.OptimisedCollapsedInstruction;
import canaryprism.writers.SourcecodeWriterJava;

//slow as fuck and very not worth it :3
public class FlowDecompilerJava extends Decompiler {

    private final ArrayList<OptimisedCollapsedInstruction> code;

    public FlowDecompilerJava(String code) {
        this.code = new FlowInterpreter(code).getOptimisedCode();
    }

    @Override
    @SuppressWarnings("resource")
    public void decompile(OutputStream out) throws IOException {
        try (var wr = new SourcecodeWriterJava(out)) {
            wr
                .startClass("Main")
                    .psvm()
                        .code("var memory = new int[60_000];")
                        .code("var pointer = 30_000;");

            for (var e : code) {
                switch (e.instruction()) {
                    case plus -> wr.code(STR."memory[pointer] = (memory[pointer] + \{e.a()}) & 255;");
                    case jump -> {
                        if (e.a() != 0) {
                            wr.startWhile("memory[pointer] != 0");
                        } else {
                            wr.endWhile();
                        }
                    }
                    case move -> wr.code(STR."pointer += \{e.a()};");
                    case in -> wr.code("memory[pointer] = System.in.read() & 255;");
                    case out -> wr.code("System.out.write((char)memory[pointer]);");
                    case findzero -> wr
                        .startWhile("memory[pointer] != 0")
                            .code(STR."pointer += \{e.a()};")
                        .endWhile();
                    case set -> wr.code(STR."memory[pointer] = \{e.a()};");
                    case transfer -> wr.code(STR."memory[pointer + \{e.a()}] = (memory[pointer + \{e.a()}] + memory[pointer] * \{e.b()}) & 255;");
                    case end -> wr.code("return;");
                    case none -> wr.code("// WARNING: none written to sourcecode here");
                }
            }

            wr
                    .endMethod()
                .endClass();
        } 
    }
    
}
