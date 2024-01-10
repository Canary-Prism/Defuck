package canaryprism.brainfuck.defuck;

import java.io.IOException;
import java.io.OutputStream;

public abstract class Decompiler {
    public abstract void decompile(OutputStream out) throws IOException;
}
