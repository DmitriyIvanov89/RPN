import DFA.DFA;
import DFA.DFAConfig;
import DFA.DFAConfigReader;
import lexicalAnalyzer.Lexer;

import java.io.IOException;

public class ReversePolishNotation {

    private final static String CONFIG_PATH = "e:\\IT\\JAVA\\my_project\\rpn_repo\\RPN\\src\\main\\resources\\dfaConfig.json";
    //private final static String CONFIG_PATH = "e:\\my\\RPN_repo\\src\\main\\resources\\dfaConfig.json";

    public static void main(String[] args) throws IOException {

        String expression = "22+1";

        DFAConfigReader reader = new DFAConfigReader(CONFIG_PATH);
        DFAConfig config = reader.readConfigJson();
        DFA dfa = new DFA(config);

        Lexer lexer = new Lexer(expression, dfa);
        System.out.println(lexer.getNextToken());
        System.out.println(lexer.getNextToken());
        System.out.println(lexer.getNextToken());
    }
}
