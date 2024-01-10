package canaryprism;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import canaryprism.brainfuck.*;
import canaryprism.brainfuck.optimising.*;

public class CLI {
    public static void main(String[] args) {

        String code = "";
        try (var code_file = new FileInputStream(args[0])) {
            code = new String(code_file.readAllBytes());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("arg0: specify a file path for the code");
            System.exit(-1);
        } catch (FileNotFoundException e) {
            System.err.println("arg0: code file not found");
            System.exit(-1);
        } catch (IOException e) {
            System.err.println("arg0: exception while reading code file");
            System.exit(-1);
        }

        Interpreter interpreter = null;
        try {
            interpreter = switch (args[1]) {
                case "-f" -> new FlowInterpreter(code);
                case "-i" -> new InfinityInterpreter(code);
                case "-d" -> new DebugInterpreter(code);
                case "-b" -> new BasicInterpreter(code);
                case "-c" -> new CollapsingInterpreter(code);
                default -> throw new IllegalArgumentException("Invalid interpreter type");
            };
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("arg1: specify an interpreter");
            System.exit(-1);
        }

        var in = System.in;
        try {
            in = new FileInputStream(args[2]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("arg2: no input file specified, using stdin");
        } catch (FileNotFoundException e) {
            System.err.println("arg2: input file not found");
            System.exit(-1);
        }

        try {
            interpreter.execute(in, System.out);
        } catch (IOException e) {
            System.err.println("IOException while executing the code");
            System.exit(-1);
        }
    }
}
