package canaryprism.writers;

import static canaryprism.writers.SourcecodeWriterSwift.Mode.*;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Stack;

public class SourcecodeWriterSwift implements AutoCloseable {
    private final OutputStream out;
    private final boolean allow_global;
    
    Stack<Mode> mode = new Stack<>();
    
    public SourcecodeWriterSwift(OutputStream out, boolean allow_global) {
        this.out = out;
        this.allow_global = allow_global;
        mode.add(file);
    }
    private int indent = 0;
    private void writeLine(String line) throws IOException {
        out.write(("    ".repeat(indent) + line + "\n").getBytes());
    }
    private void checkMode(Mode... allowed) {
        if (allowed.length == 0) 
            throw new IllegalArgumentException("allowed modes cannot be empty");
        for (Mode m : allowed) {
            if (m == mode.peek()) return;
        }
        throw new ModeMismatchException(mode.peek(), allowed);
    }

    public SourcecodeWriterSwift writeImport(String imp) throws IOException {
        checkMode(file);
        writeLine("import " + imp);
        return this;
    }

    public SourcecodeWriterSwift startClass(String name_and_inheritance) throws IOException {
        checkMode(file, member, code);
        writeLine("class " + name_and_inheritance + " {");
        mode.push(member);
        indent++;
        return this;
    }
    public SourcecodeWriterSwift endClass() throws IOException {
        checkMode(member);
        indent--;
        writeLine("}");
        mode.pop();
        return this;
    }

    public SourcecodeWriterSwift startFunc(String name, String... args) throws IOException {
        writeLine("func " + name + "(" + String.join(", ", args) + ") {");
        indent++;
        return this;
    }
    public SourcecodeWriterSwift startFunc(String type, String name, String... args) throws IOException {
        checkMode(code, member);
        writeLine(STR."func \{name}(\{String.join(", ", args)}) -> \{type} {");
        mode.push(code);
        indent++;
        return this;
    }
    public SourcecodeWriterSwift endFunc() throws IOException {
        checkMode(code);
        indent--;
        writeLine("}");
        mode.pop();
        return this;
    }

    public SourcecodeWriterSwift startWhile(String condition) throws IOException {
        if (allow_global)
            checkMode(code, file);
        else
            checkMode(code);
        writeLine("while " + condition + " {");
        mode.push(code);
        indent++;
        return this;
    }
    public SourcecodeWriterSwift endWhile() throws IOException {
        checkMode(code);
        indent--;
        writeLine("}");
        mode.pop();
        return this;
    }

    public SourcecodeWriterSwift code(String statement) throws IOException {
        if (allow_global)
            checkMode(code, file);
        else
            checkMode(code);
        writeLine(statement);
        return this;
    }

    @Override
    public void close() throws IOException {
        this.out.close();
    }

    protected enum Mode {
        file, member, code
    }

    private class ModeMismatchException extends RuntimeException {
        public ModeMismatchException(Mode current, Mode... expected) {
            super(STR."this can only be written in \{Arrays.toString(expected)} scope(s), but got \{current} scope");
        }
    }
}
