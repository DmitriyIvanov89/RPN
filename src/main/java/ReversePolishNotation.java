import DFA.DFA;
import DFA.DFAConfig;
import DFA.DFAConfigReader;
import lexicalAnalyzer.Lexer;

import java.io.IOException;

public class ReversePolishNotation {

<<<<<<< HEAD
    private final static String CONFIG_PATH = "e:\\IT\\JAVA\\my_project\\rpn_repo\\RPN\\src\\main\\resources\\dfaConfig.json";
    //private final static String CONFIG_PATH = "e:\\my\\RPN_repo\\src\\main\\resources\\dfaConfig.json";

    public static void main(String[] args) throws IOException {

        String expression = "22+1";
=======
    private final static String CONFIG_PATH = "d:\\my\\RPE_repo\\src\\main\\resources\\dfaConfig.json";
    //private final static String CONFIG_PATH = "e:\\IT\\JAVA\\my_project\\rpn_repo\\RPE\\src\\main\\resources\\dfaConfig.json";

    public static void main(String[] args) throws IOException {

        String expression = "22+2";
>>>>>>> 63e5c70e6a1c6318dd5f012522c82e18b20f514d

        DFAConfigReader reader = new DFAConfigReader(CONFIG_PATH);
        DFAConfig config = reader.readConfigJson();
        DFA dfa = new DFA(config);

        Lexer lexer = new Lexer(expression, dfa);
        System.out.println(lexer.getNextToken());
<<<<<<< HEAD
        System.out.println(lexer.getNextToken());
        System.out.println(lexer.getNextToken());
=======


>>>>>>> 63e5c70e6a1c6318dd5f012522c82e18b20f514d
    }
}
