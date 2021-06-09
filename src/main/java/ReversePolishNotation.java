import lexicalAnalyzer.Lexer;

import java.io.IOException;

public class ReversePolishNotation {

    public static void main(String[] args) throws IOException {

        String input = "22.2+22";
        Lexer lexer = new Lexer(input);
        System.out.println(lexer.getNextToken());

    }
}
