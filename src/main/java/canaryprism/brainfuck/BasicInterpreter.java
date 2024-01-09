package canaryprism.brainfuck;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

//im sorry
import static canaryprism.brainfuck.Instruction.*;

/**
 * basic unremarkable interpreter
 */
public class BasicInterpreter extends Interpreter {

    public BasicInterpreter(String code) {
        super(code);
    }

    @Override
    public void execute(InputStream in, OutputStream out) throws IOException {
        var memory = new int[60_000];
        var pointer = 30_000;

        for (int i = 0; i < code.size(); i++) {
            switch (code.get(i)) {
                case plus -> memory[pointer] = (memory[pointer] + 1) & 255;
                case minus -> memory[pointer] = (memory[pointer] - 1) & 255;
                case startloop -> {
                    if (memory[pointer] == 0) {
                        var loops = 1;
                        while (loops > 0) {
                            i++;
                            if (code.get(i) == startloop)
                                loops++;
                            else if (code.get(i) == endloop)
                                loops--;
                        }
                    }
                }
                case endloop -> {
                    if (memory[pointer] != 0) {
                        var loops = 1;
                        while (loops > 0) {
                            i--;
                            if (code.get(i) == endloop)
                                loops++;
                            else if (code.get(i) == startloop)
                                loops--;
                        }
                    }
                }
                case left -> pointer--;
                case right -> pointer++;
                case out -> out.write(memory[pointer]);
                case in -> memory[pointer] = ~(~in.read() | -256);
                case end -> { return; }
            }
        }
    }
}
