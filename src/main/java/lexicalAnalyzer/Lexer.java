package lexicalAnalyzer;

import DFA.*;

import java.io.IOException;

public class Lexer {

    //private final static String CONFIG_PATH = "d:\\my\\RPE_repo\\src\\main\\resources\\dfaConfig.json";
    private final static String CONFIG_PATH = "e:\\IT\\JAVA\\my_project\\rpn_repo\\RPN\\src\\main\\resources\\dfaConfig.json";
    private final String expr;
    private DFA dfa;
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
            if (currState.hasTransition(expr.charAt(position))) {
                currState = currState.getTransition(expr.charAt(position));
                valueToken += expr.charAt(position);
                position++;
            } else {
                if (!currState.isFinite()) {
                    System.out.println("Fuck");
                } else {
                    return new Token(valueToken, TokenType.valueOf(currState.getType()));
                }
            }
        }
        return currToken;
    }

    public Token lookAHead() {
        return null;
    }
}
