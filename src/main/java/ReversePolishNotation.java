import DFA.DFA;
import DFA.DFAConfig;
import DFA.DFAConfigReader;
import lexicalAnalyzer.Lexer;

import java.io.IOException;

public class ReversePolishNotation {

    //private final static String CONFIG_PATH = "d:\\my\\RPE_repo\\src\\main\\resources\\dfaConfig.json";
    //private final static String CONFIG_PATH = "e:\\IT\\JAVA\\my_project\\rpn_repo\\RPE\\src\\main\\resources\\dfaConfig.json";

    public static void main(String[] args) throws IOException {

        String input = "22+2";
        Lexer lexer = new Lexer(input);


    }
}
