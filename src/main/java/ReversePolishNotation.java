import DFA.DFA;
import DFA.DFAConfig;
import DFA.DFAConfigReader;

import java.io.IOException;

public class ReversePolishNotation {

    private final static String CONFIG_PATH = "e:\\IT\\JAVA\\my_project\\rpn_repo\\RPN\\src\\main\\resources\\dfaConfig.json";

    public static void main(String[] args) throws IOException {

        DFAConfigReader reader = new DFAConfigReader(CONFIG_PATH);
        DFAConfig config = reader.readConfigJson();

        DFA dfa = new DFA(config);

    }
}
