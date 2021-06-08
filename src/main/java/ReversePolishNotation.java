import lexicalAnalyzer.Lexer;
import java.io.IOException;

public class ReversePolishNotation {

    public static void main(String[] args) throws IOException {

        String input = "22+2";
        Lexer lexer = new Lexer(input);
        System.out.println(lexer.getNextToken());
<<<<<<< HEAD
        System.out.println(lexer.getNextToken());
        System.out.println(lexer.getNextToken());
=======

>>>>>>> 3674e06d7b963cd7fd66ed8648a598ef27c9f38b
    }
}
