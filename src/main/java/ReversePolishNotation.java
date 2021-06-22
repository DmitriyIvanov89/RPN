import dfa.DFA;
import dfa.DFAConfig;
import dfa.DFAConfigReader;
import lexer.Lexer;
import lexer.Token;
import reversepolishcalculator.Calculator;
import reversepolishcalculator.Convector;

import java.io.IOException;

public class ReversePolishNotation {

    private final static String CONFIG_PATH = "d:\\my\\RPE_repo\\src\\main\\resources\\dfaConfig.json";
    //private final static String CONFIG_PATH = "e:\\IT\\JAVA\\my_project\\rpn_repo\\RPN\\src\\main\\resources\\dfaConfig.json";

    public static void main(String[] args) throws IOException {

        DFAConfigReader reader = new DFAConfigReader(CONFIG_PATH);
        DFAConfig config = reader.readConfigJson();
        DFA dfa = new DFA(config);

        String input = "5*2+10";

        Lexer lexer = new Lexer(input, dfa);
        Convector convector = new Convector(lexer);

        System.out.println(convector.convertExpression(input));

    }
}
