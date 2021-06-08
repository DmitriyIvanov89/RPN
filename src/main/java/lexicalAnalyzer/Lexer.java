package lexicalAnalyzer;

import DFA.*;

import java.io.IOException;

public class Lexer {

    private final static String CONFIG_PATH = "d:\\my\\RPE_repo\\src\\main\\resources\\dfaConfig.json";
    //private final static String CONFIG_PATH = "e:\\IT\\JAVA\\my_project\\rpn_repo\\RPE\\src\\main\\resources\\dfaConfig.json";
    private final String expr;
<<<<<<< HEAD
<<<<<<< HEAD
    private State currState;
    private Token currentToken;
    private DFA dfa;

    public Lexer(String expr, DFA dfa) {
        this.expr = expr;
        this.dfa = dfa;
    }

    public Token getNextToken() {
        currState = dfa.getStartState();
        String value = "";
        int pos = 0;
        while (pos < expr.length()){
            if (currState.hasTransition(expr.charAt(pos))) {
                currState = currState.getTransition(expr.charAt(pos));
                value += expr.charAt(pos);
                pos++;
            } else {
                if (!currState.isFinite()) {
                    System.out.println("Wrong state");
                } else {
                    currentToken = new Token(value, TokenType.NUMBER);
                    currState = dfa.getStartState();

                }
            }
        }
        return currentToken;
=======
    private DFA dfa;
=======
    private int position;
>>>>>>> 3674e06d7b963cd7fd66ed8648a598ef27c9f38b
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
<<<<<<< HEAD
        return currToken;
>>>>>>> 63e5c70e6a1c6318dd5f012522c82e18b20f514d
=======
        return null;
>>>>>>> 3674e06d7b963cd7fd66ed8648a598ef27c9f38b
    }

    public Token lookAHead() {
        return null;
    }
}
