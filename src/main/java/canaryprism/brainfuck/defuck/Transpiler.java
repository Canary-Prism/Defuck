package canaryprism.brainfuck.defuck;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;

import canaryprism.brainfuck.optimising.FlowInterpreter;
import canaryprism.brainfuck.optimising.FlowInterpreter.OptimisedCollapsedInstruction;

public abstract class Transpiler {

    protected final String code;

    public Transpiler(String code) {
        this.code = code;

        transpile();
    }

    public abstract void write(OutputStream out) throws IOException;

    protected abstract void transpile();
}
