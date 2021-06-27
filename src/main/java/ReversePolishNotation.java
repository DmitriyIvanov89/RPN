import dfa.DFA;
import dfa.DFAConfig;
import dfa.DFAConfigReader;
import lexer.Lexer;
import reversepolishcalculator.Calculator;
import reversepolishcalculator.Converter;

import java.io.IOException;

public class ReversePolishNotation {

    //private final static String CONFIG_PATH = "d:\\my\\RPE_repo\\src\\main\\resources\\dfaConfig.json";
    private final static String CONFIG_PATH = "e:\\IT\\JAVA\\my_project\\rpn_repo\\RPN\\src\\main\\resources\\dfaConfig.json";

    public static void main(String[] args) throws IOException {

        DFAConfigReader reader = new DFAConfigReader(CONFIG_PATH);
        DFAConfig config = reader.readConfigJson();
        DFA dfa = new DFA(config);

        String input = " 2 * 2 + 10";

        Lexer lexer = new Lexer(input, dfa);
        Converter convector = new Converter(lexer);

        Calculator calculator = new Calculator(convector);
        System.out.println(calculator.calculate(input));

    }
}
