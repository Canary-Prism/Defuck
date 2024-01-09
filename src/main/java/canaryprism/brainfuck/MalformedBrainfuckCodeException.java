package canaryprism.brainfuck;

public class MalformedBrainfuckCodeException extends IllegalArgumentException {

    public MalformedBrainfuckCodeException(String message) {
        super(message);
    }
    
}