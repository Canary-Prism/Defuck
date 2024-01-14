package canaryprism.writers;

import static canaryprism.writers.SourcecodeWriterJava.Mode.*;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Stack;

public class SourcecodeWriterJava implements AutoCloseable {
    private final OutputStream out;
    
    Stack<Mode> mode = new Stack<>();
    
    public SourcecodeWriterJava(OutputStream out) {
        this.out = out;
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

    public SourcecodeWriterJava writeImport(String imp) throws IOException {
        return writeImport(false, imp);
    }
    public SourcecodeWriterJava writeImport(boolean is_static, String imp) throws IOException {
        checkMode(file);
        writeLine("import " + (is_static ? "static " : "") + imp + ";");
        return this;
    }

    public SourcecodeWriterJava startClass(String name_and_inheritance) throws IOException {
        checkMode(file, member);
        writeLine("class " + name_and_inheritance + " {");
        mode.push(member);
        indent++;
        return this;
    }
    public SourcecodeWriterJava endClass() throws IOException {
        checkMode(member);
        indent--;
        writeLine("}");
        mode.pop();
        return this;
    }

    public SourcecodeWriterJava psvm() throws IOException {
        checkMode(member);
        writeLine("public static void main(String[] args) {");
        mode.push(code);
        indent++;
        return this;
    }
    public SourcecodeWriterJava psvm(String... throwing) throws IOException {
        checkMode(member);
        writeLine(STR."public static void main(String[] args) throws \{String.join(", ", throwing)} {");
        mode.push(code);
        indent++;
        return this;
    }
    public SourcecodeWriterJava startMethod(String type, String name, String... args) throws IOException {
        checkMode(member);
        writeLine(type + " " + name + "(" + String.join(", ", args) + ") {");
        mode.push(code);
        indent++;
        return this;
    }
    public SourcecodeWriterJava endMethod() throws IOException {
        checkMode(code);
        indent--;
        writeLine("}");
        mode.pop();
        return this;
    }

    public SourcecodeWriterJava startWhile(String condition) throws IOException {
        checkMode(code);
        writeLine("while (" + condition + ") {");
        mode.push(code);
        indent++;
        return this;
    }
    public SourcecodeWriterJava endWhile() throws IOException {
        checkMode(code);
        indent--;
        writeLine("}");
        mode.pop();
        return this;
    }

    public SourcecodeWriterJava code(String statement) throws IOException {
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
