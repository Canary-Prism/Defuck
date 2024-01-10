package canaryprism.brainfuck.optimising;

import canaryprism.brainfuck.Instruction;
import canaryprism.brainfuck.Interpreter;
import canaryprism.brainfuck.MalformedBrainfuckCodeException;

public abstract class OptimisingInterpreter extends Interpreter {

    public OptimisingInterpreter(String code) {
        super(code);
        this.code.add(Instruction.end);

        //balanced loop safety
        //since optimising interpreters would require more preprocessing, this makes validating the code required
        var loop = 0;
        var chars = code.chars().toArray();
        for (int i = 0; i < chars.length; i++) {
            var e = chars[i];
            loop += switch ((char)e) {
                case '[' -> 1;
                case ']' -> -1;
                default -> 0;
            };
            if (loop < 0)
                throw new MalformedBrainfuckCodeException(STR."""
                        Extra closing loop ']' at position: \{i}
                        \{code.substring(Math.max(i - 5, 0), Math.min(i + 5, chars.length))}
                             ^
                        """);
        }
        if (loop > 0)
            throw new MalformedBrainfuckCodeException(STR."""
                    \{loop} unterminated loops
                    """);

        optimise();
    }

    protected abstract void optimise();

    public abstract String getOptimisedCodeString();
}
