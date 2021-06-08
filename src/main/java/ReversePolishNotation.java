import lexicalAnalyzer.Lexer;

import java.io.IOException;

public class ReversePolishNotation {

    public static void main(String[] args) throws IOException {

        String expression = "22+2";
        Lexer lexer = new Lexer(expression);
        System.out.println(lexer.getNextToken());

    }
}
