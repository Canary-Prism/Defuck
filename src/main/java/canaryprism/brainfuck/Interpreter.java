package canaryprism.brainfuck;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public abstract class Interpreter {

    protected final List<Instruction> code;

    public Interpreter(String code) {
        this.code = new ArrayList<>(code.replaceAll("[^+\\-\\[\\]<>.,]", "")
            .chars()
            .mapToObj((e) -> (char)e)
            .map(Instruction::fromChar)
            .toList());
    }

    public abstract void execute(InputStream in, OutputStream out) throws IOException;
}
