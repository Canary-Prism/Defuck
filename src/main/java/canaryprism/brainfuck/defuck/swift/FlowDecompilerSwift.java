package canaryprism.brainfuck.defuck.swift;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;

import canaryprism.brainfuck.defuck.Decompiler;
import canaryprism.brainfuck.optimising.FlowInterpreter;
import canaryprism.brainfuck.optimising.FlowInterpreter.OptimisedCollapsedInstruction;
import canaryprism.writers.SourcecodeWriterJava;
import canaryprism.writers.SourcecodeWriterSwift;

public class FlowDecompilerSwift extends Decompiler {

    private final ArrayList<OptimisedCollapsedInstruction> code;

    public FlowDecompilerSwift(String code) {
        this.code = new FlowInterpreter(code).getOptimisedCode();
    }

    @Override
    @SuppressWarnings("resource")
    public void decompile(OutputStream out) throws IOException {
        try (var wr = new SourcecodeWriterSwift(out, true)) {
            wr
                        .writeImport("Darwin")
                        .code("var memory = [Int](repeating: 0, count: 60_000)")
                        .code("var pointer = 30_000");

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
                    case move -> wr.code(STR."pointer += \{e.a()}");
                    case in -> wr.code("memory[pointer] = Int(fgetc(stdin))");
                    case out -> wr.code("fputc(Int32(memory[pointer]), stdout)");
                    case findzero -> wr
                        .startWhile("memory[pointer] != 0")
                            .code(STR."pointer += \{e.a()}")
                        .endWhile();
                    case set -> wr.code(STR."memory[pointer] = \{e.a()}");
                    case transfer -> wr.code(STR."memory[pointer + \{e.a()}] = (memory[pointer + \{e.a()}] + memory[pointer] * \{e.b()}) & 255");
                    case end -> wr.code("// end of code");
                    case none -> wr.code("// WARNING: none written to sourcecode here");
                }
            }
        } 
    }
    
}
