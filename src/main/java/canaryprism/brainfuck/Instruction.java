package canaryprism.brainfuck;

public enum Instruction {
    plus, minus, startloop, endloop, left, right, out, in, end;

    public static Instruction fromChar(char c) {
        return switch (c) {
            case '+' -> plus;
            case '-' -> minus;
            case '[' -> startloop;
            case ']' -> endloop;
            case '<' -> left;
            case '>' -> right;
            case '.' -> out;
            case ',' -> in;
            default -> throw new RuntimeException(STR."""
                    too lazy to make a custom exception
                    uh.. right "\{c}" is definitely not brainfuck compliant
                    try again nerd
                    """);
        };
    }

    public char toChar() {
        return switch (this) {
            case plus -> '+';
            case minus -> '-';
            case startloop -> '[';
            case endloop -> ']';
            case left -> '<';
            case right -> '>';
            case out -> '.';
            case in -> ',';
            case end -> ';';
        };
    }
}