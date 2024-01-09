package canaryprism;

import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.util.Scanner;

import canaryprism.brainfuck.*;
import canaryprism.brainfuck.defuck.*;

public class Main {
    public static void main(String[] args) throws IOException, URISyntaxException {
        var data = Main.class.getClassLoader().getResourceAsStream("brainfuck/code.bf").readAllBytes();
        var in = Main.class.getClassLoader().getResourceAsStream("brainfuck/in.txt");
        var out = System.out;
        var code = new String(data);


        // for (long i = 2, inc = 1, mul = 0; i >= 0; i += (inc = ((mul = (mul + 1) % 9) == 0) ? inc * 10 : inc)) {
        //     System.out.println(STR."array \{(int)(i >> 31)}, element \{(int)(i & 2147483647)}, \{i}");
        // }
        Interpreter interpreter = new FlowInterpreter(code);

        if (interpreter instanceof OptimisingInterpreter e) {
            System.out.println(e.getOptimisedCode());
        }

        // long begin = System.nanoTime();

        interpreter.execute(in, out);

        // long elapsed = System.nanoTime() - begin;

        out.flush();
        out.close();
        // System.out.println(STR."\nTotal time took: \{BigDecimal.valueOf(elapsed).divide(BigDecimal.valueOf(1_000_000)).toPlainString()} ms");

    }

    static String readFrom(InputStream in, boolean close) {
        var sc = new Scanner(in);
        var builder = new StringBuilder();
        var next = "";
        while (!(next = sc.nextLine()).equals("END")) {
            builder.append(next.replaceAll("[^+\\-\\[\\]<>.,]", ""));
        }
        if (close)
            sc.close();
        return builder.toString();
    }

}