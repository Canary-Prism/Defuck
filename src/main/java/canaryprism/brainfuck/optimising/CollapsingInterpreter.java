package canaryprism.brainfuck.optimising;

import static canaryprism.brainfuck.Instruction.*;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;

import canaryprism.brainfuck.optimising.CollapsingInterpreter.CollapsedInstruction.SimplerInstruction;

/**
 * this interpreter does basic collapsing of instructions
 */
public class CollapsingInterpreter extends OptimisingInterpreter {

    public ArrayList<CollapsedInstruction> collapsed_code;

    public CollapsingInterpreter(String code) {
        super(code);
    }

    @Override
    public void optimise() {
        collapsed_code = new ArrayList<>();
        optimise(0, code.size());
    }

    private void optimise(int from, int to) {
        for (int i = from; i < to; i++) {
            
            switch (code.get(i)) {
                case plus, minus -> {
                    var amount = 0;
                    while (i < code.size() && (code.get(i) == plus || code.get(i) == minus)) {
                        amount += (code.get(i) == plus) ? 1 : -1;
                        i++;
                    }
                    if (amount % 256 != 0)
                        collapsed_code.add(new CollapsedInstruction(SimplerInstruction.plus, amount % 256, 0));

                    i--;
                }
                case left, right -> {
                    var amount = 0;
                    while (code.get(i) == right || code.get(i) == left)
                        amount += (code.get(i++) == right) ? 1 : -1;

                    
                    if (amount != 0)
                        collapsed_code.add(new CollapsedInstruction(SimplerInstruction.move, amount, 0));

                    i--;
                }

                case startloop -> {
                    var a = i;
                    var opening = collapsed_code.size();
                    collapsed_code.add(null);

                    var loops = 1;
                    while (loops > 0) {
                        i++;
                        if (code.get(i) == startloop)
                            loops++;
                        else if (code.get(i) == endloop)
                            loops--;
                    }

                    optimise(a + 1, i);

                    collapsed_code.set(opening, new CollapsedInstruction(SimplerInstruction.jump, collapsed_code.size() - opening, 0));

                    collapsed_code.add(new CollapsedInstruction(SimplerInstruction.jump, 0, collapsed_code.size() - opening));
                }

                case out -> collapsed_code.add(new CollapsedInstruction(SimplerInstruction.out, 0, 0));
                case in -> {
                    if (collapsed_code.size() > 0 && collapsed_code.getLast().instruction() == SimplerInstruction.plus)
                        collapsed_code.removeLast();
                    collapsed_code.add(new CollapsedInstruction(SimplerInstruction.in, 0, 0));
                }

                case endloop -> {}
                case end -> collapsed_code.add(new CollapsedInstruction(SimplerInstruction.end, 0, 0));
            }
        }
    }

    @Override
    public void execute(InputStream in, OutputStream out) throws IOException {
        int[] memory = new int[60_000];
        int pointer = 30_000;

        for (int i = 0; i < collapsed_code.size(); i++) {
            var here = collapsed_code.get(i);
            switch (here.instruction()) {
                case plus -> memory[pointer] = (memory[pointer] + here.a()) & 255;
                case jump -> {
                    if (memory[pointer] == 0) {
                        i += here.a();
                    } else {
                        i -= here.b();
                    }
                }
                case move -> pointer += here.a();
                case out -> out.write(memory[pointer]);
                case in -> memory[pointer] = in.read() & 255;
                case end -> { return; }
            }
        }
    }

    public String getOptimisedCodeString() {
        return collapsed_code.stream()
            .map(CollapsedInstruction::toString)
            .reduce("", String::concat);
    }
    

    /**
     * <p>
     * this holds an instruction and also an integer
     * </p>
     * <p>
     * the integer {@code data} is used to note:
     * </p>
     * <ul>
     * <li>the amount to add/subtract</li>
     * <li>the instruction pointer to jump to</li>
     * <li>the amount to move the memory pointer</li>
     * </ul>
     */
    protected record CollapsedInstruction(SimplerInstruction instruction, int a, int b) {
        /**
         * omits minus and left
         */
        public enum SimplerInstruction {
            plus, jump, move, out, in, end;

            public char toChar() {
                return switch (this) {
                    case plus -> '+';
                    case jump -> '[';
                    case move -> '>';
                    case out -> '.';
                    case in -> ',';
                    case end -> ';';
                };
            }
        }

        @Override
        public String toString() {
            return switch (instruction) {
                case out, in, end -> " " + instruction.toChar();
                case jump -> (b == 0) ? " " + '[' + a : " " + b + ']';
                default -> " " + instruction.toChar() + a;
            };
        }
    }
}
