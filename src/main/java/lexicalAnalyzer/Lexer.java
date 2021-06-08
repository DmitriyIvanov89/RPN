package lexicalAnalyzer;

import DFA.*;

import java.io.IOException;
import java.util.Iterator;

public class Lexer {

    private final static String CONFIG_PATH = "d:\\my\\RPE_repo\\src\\main\\resources\\dfaConfig.json";
    //private final static String CONFIG_PATH = "e:\\IT\\JAVA\\my_project\\rpn_repo\\RPE\\src\\main\\resources\\dfaConfig.json";
    private final String expr;
    private int position;
    private State currState;
    private Token currToken;
    private String valueToken;

    public Lexer(String expr) throws IOException {
        this.expr = expr;
        DFAConfigReader reader = new DFAConfigReader(CONFIG_PATH);
        DFAConfig config = reader.readConfigJson();
        DFA dfa = new DFA(config);
        this.currState = dfa.getStartState();
        this.valueToken = "";
        this.position = 0;
    }

    public Token getNextToken() {
        while (position < expr.length()) {
            currState = currState.getTransition(expr.charAt(position));
            valueToken += expr.charAt(position);
            position++;
        }
        return currToken;
    }

    public Token lookAHead() {
        return null;
    }
}
