<<<<<<< HEAD
import lexicalAnalyzer.Lexer;
=======
import dfa.DFA;
import dfa.DFAConfig;
import dfa.DFAConfigReader;
import lexer.Lexer;
import lexer.TokenType;
>>>>>>> newDev

import java.io.IOException;

public class ReversePolishNotation {

    //private final static String CONFIG_PATH = "d:\\my\\RPE_repo\\src\\main\\resources\\dfaConfig.json";
    private final static String CONFIG_PATH = "e:\\IT\\JAVA\\my_project\\rpn_repo\\RPN\\src\\main\\resources\\dfaConfig.json";

    public static void main(String[] args) throws IOException {

<<<<<<< HEAD
        String expression = "22+2";
        Lexer lexer = new Lexer(expression);
        System.out.println(lexer.getNextToken());
=======
        DFAConfigReader reader = new DFAConfigReader(CONFIG_PATH);
        DFAConfig config = reader.readConfigJson();
        DFA dfa = new DFA(config);
        String input = "1.5*0.23-55/101";
>>>>>>> newDev

        Lexer lexer = new Lexer(input, dfa);
        while (lexer.lookAhead().getType() != TokenType.UNDEFINED && lexer.lookAhead().getType() != TokenType.EOF) {
            System.out.println(lexer.getNextToken());
        }
    }
}
