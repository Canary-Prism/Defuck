package canaryprism;

import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.URISyntaxException;
import java.util.Scanner;

import canaryprism.brainfuck.*;
import canaryprism.brainfuck.defuck.java.FlowTranspilerJava;
import canaryprism.brainfuck.defuck.java.StateTranspilerJava;
import canaryprism.brainfuck.defuck.swift.FlowTranspilerSwift;
import canaryprism.brainfuck.optimising.*;

public class Main {
    public static void main(String[] args) throws IOException, URISyntaxException {
        var data = Main.class.getClassLoader().getResourceAsStream("brainfuck/code.bf").readAllBytes();
        var in = Main.class.getClassLoader().getResourceAsStream("brainfuck/in.txt");
        var out = new FileOutputStream("/Users/mia/Documents/Defuck/defuck/Main.java");
        var code = new String(data);


        // for (long i = 2, inc = 1, mul = 0; i >= 0; i += (inc = ((mul = (mul + 1) % 9) == 0) ? inc * 10 : inc)) {
        //     System.out.println(STR."array \{(int)(i >> 31)}, element \{(int)(i & 2147483647)}, \{i}");
        // }

        System.out.println(new FlowInterpreter(code).getOptimisedCodeString());



        var decomp = new FlowTranspilerJava(code);

        decomp.write(out);
        
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