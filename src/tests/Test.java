package tests;

import main.java.expression.*;
import main.java.parser.*;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.CharStreams;

import java.io.*;

public class Test {

    private static void runTest(String name) {

        try (BufferedWriter writer =
                     new BufferedWriter(new OutputStreamWriter(new FileOutputStream("tests_output/" + name + ".cpp")));
             BufferedReader reader =
                     new BufferedReader(new InputStreamReader(new FileInputStream("tests/" + name)))
        ) {
            StringBuilder code = new StringBuilder();
            String next;
            while ((next = reader.readLine()) != null) {
                code.append(next).append("\n");
            }
            runTest(code.toString(), writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void runTest(String code, BufferedWriter writer) throws IOException {
        FProgramLexer lexer = new FProgramLexer(CharStreams.fromString(code));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        FProgramParser parser = new FProgramParser(tokens);
        FProgram program = parser.start().p;
        writer.write(program.toString());
    }

    public static void main(String[] args) {
        runTest("test1");
    }

}
