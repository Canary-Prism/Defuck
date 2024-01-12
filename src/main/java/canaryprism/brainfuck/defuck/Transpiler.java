package canaryprism.brainfuck.defuck;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;

import canaryprism.brainfuck.optimising.FlowInterpreter;
import canaryprism.brainfuck.optimising.FlowInterpreter.OptimisedCollapsedInstruction;

public abstract class Transpiler {

    protected final ArrayList<OptimisedCollapsedInstruction> code;

    public Transpiler(String code) {
        this.code = new FlowInterpreter(code).getOptimisedCode();
    }

    public abstract void decompile(OutputStream out) throws IOException;
}
