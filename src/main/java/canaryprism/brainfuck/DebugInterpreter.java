package canaryprism.brainfuck;

import static canaryprism.brainfuck.Instruction.endloop;
import static canaryprism.brainfuck.Instruction.startloop;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.util.ArrayList;

/**
 * visualises things :3
 */
public class DebugInterpreter extends InfinityInterpreter {

    public DebugInterpreter(String code) {
        super(code);

        //balanced loop safety
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
    }

    @Override
    public void execute(InputStream in, OutputStream out) throws IOException {
        var memory = new InfinityMemory();
        var pointer = BigInteger.valueOf(0);
        var one = BigInteger.valueOf(1);

        for (int i = 0; i < code.size(); i++) {
            switch (code.get(i)) {
                case plus -> memory.increment(pointer);
                case minus -> memory.decrement(pointer);
                case startloop -> {
                    if (memory.get(pointer) == 0) {
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
                    if (memory.get(pointer) != 0) {
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
                case left -> pointer = pointer.subtract(one);
                case right -> pointer = pointer.add(one);
                case out -> {
                    if (out != System.out)
                        out.write(memory.get(pointer));
                    write(memory.get(pointer));
                }
                case in -> {
                    if (in == System.in) 
                        memory.put(pointer, read() & 255);
                    else
                        memory.put(pointer, in.read() & 255);
                }
                case end -> { return; }
            }

            log(memory, pointer, i);
        }
    }

    private ArrayList<Character> written_chars = new ArrayList<>();

    private void write(int data) {
        written_chars.add((char)data);
    }

    private int read() throws IOException {
        System.out.print("Enter a value: ");
        var val = System.in.read();
        System.out.println();
        return val;
    }

    private int memory_cursor = 0;
    private BigInteger memory_window = BigInteger.valueOf(0);
    private BigInteger last_pointer = BigInteger.valueOf(0);

    private void log(InfinityMemory memory, BigInteger pointer, int code_pointer) {
        var thirty = BigInteger.valueOf(30);
        var one = BigInteger.valueOf(1);

        if (pointer.subtract(last_pointer).intValue() == 1) {
            if (memory_cursor < 29)
                memory_cursor++;
            else
                memory_window = memory_window.add(one);
        } else if (pointer.subtract(last_pointer).intValue() == -1) {
            if (memory_cursor > 0)
                memory_cursor--;
            else 
                memory_window = memory_window.subtract(one);
        }

        last_pointer = pointer;



        var memory_builder = new StringBuilder().append("[...|");
        for (var i = memory_window; i.compareTo(memory_window.add(thirty)) < 0; i = i.add(one)) {
            memory_builder.append(String.format("%3d|", memory.get(i)));
        }
        memory_builder.append("...]");

        var code_builder = new StringBuilder();

        for (var i = Math.max(code_pointer - 50, 0); i < Math.min(Math.max(code_pointer + 40, 50 + 40), code.size()); i++) {
            code_builder.append(code.get(i).toChar());
        }

        var written_string = written_chars.stream().map(String::valueOf).reduce("", String::concat);

        System.out.println(STR."""
                Code: At Position \{code_pointer}
                \{code_builder.toString()}
                \{" ".repeat(Math.min(code_pointer, 50))} ^
                Memory: At Position \{pointer.toString()}
                \{memory_builder.toString()}
                \{"    ".repeat(memory_cursor)}      ^
                Printed Characters: 
                \{written_string}
                """);

        // try {
        //     Thread.sleep(2);
        // } catch (InterruptedException e) {
        // }
    }
}
