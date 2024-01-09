package canaryprism.brainfuck;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

import static canaryprism.brainfuck.Instruction.*;

/**
 * Slow ass but infinite memory interpreter :3
 */
public class InfinityInterpreter extends Interpreter {

    public InfinityInterpreter(String code) {
        super(code);
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
                case out -> out.write(memory.get(pointer));
                case in -> memory.put(pointer, ~(~in.read() | -256));
                case end -> { return; }
            }
        }
    }

    protected class InfinityMemory {
        Map<BigInteger, Integer> memory = new HashMap<>();

        int get(BigInteger pointer) {
            if (memory.containsKey(pointer)) {
                return memory.get(pointer);
            }
            return 0;
        }

        void math(BigInteger pointer, Function<Integer, Integer> f) {
            memory.put(pointer, f.apply(memory.getOrDefault(pointer, 0)) & 255);
        }

        void increment(BigInteger pointer) {
            math(pointer, (e) -> ++e);
        }

        void decrement(BigInteger pointer) {
            math(pointer, (e) -> --e);
        }

        void put(BigInteger pointer, int value) {
            math(pointer, (e) -> value);
        }
    }
}