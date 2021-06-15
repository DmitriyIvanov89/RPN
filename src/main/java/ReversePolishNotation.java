<<<<<<< HEAD
=======
import dfa.DFA;
import dfa.DFAConfig;
import dfa.DFAConfigReader;
import lexer.Lexer;
import lexer.TokenType;

>>>>>>> c1bb36dfe3fb6c7c0ba89c614133c07465da5382
import java.io.IOException;

public class ReversePolishNotation {

<<<<<<< HEAD
    private final static String CONFIG_PATH = "d:\\my\\RPE_repo\\src\\main\\resources\\dfaConfig.json";
    //private final static String CONFIG_PATH = "e:\\IT\\JAVA\\my_project\\rpn_repo\\RPE\\src\\main\\resources\\dfaConfig.json";

    public static void main(String[] args) throws IOException {

=======
    //private final static String CONFIG_PATH = "d:\\my\\RPE_repo\\src\\main\\resources\\dfaConfig.json";
    private final static String CONFIG_PATH = "e:\\IT\\JAVA\\my_project\\rpn_repo\\RPN\\src\\main\\resources\\dfaConfig.json";

    public static void main(String[] args) throws IOException {

        DFAConfigReader reader = new DFAConfigReader(CONFIG_PATH);
        DFAConfig config = reader.readConfigJson();
        DFA dfa = new DFA(config);
        String input = "1.5*0.23-55/101";
>>>>>>> c1bb36dfe3fb6c7c0ba89c614133c07465da5382

        Lexer lexer = new Lexer(input, dfa);
        while (lexer.lookAhead().getType() != TokenType.UNDEFINED && lexer.lookAhead().getType() != TokenType.EOF) {
            System.out.println(lexer.getNextToken());
        }
    }
}
