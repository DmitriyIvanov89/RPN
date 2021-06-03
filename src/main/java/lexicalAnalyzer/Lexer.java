package lexicalAnalyzer;

import DFA.DFA;
import DFA.DFAConfigReader;
import DFA.DFAConfig;
import DFA.State;

import java.io.IOException;

public class Lexer {

    private final static String CONFIG_PATH = "d:\\my\\RPE_repo\\src\\main\\resources\\dfaConfig.json";
    private final String expr;
    private final State startState;

    public Lexer(String expr) throws IOException {
        this.expr = expr;
        DFAConfigReader reader = new DFAConfigReader(CONFIG_PATH);
        DFAConfig config = reader.readConfigJson();
        DFA dfaLexer = new DFA(config);
        this.startState = dfaLexer.getStartState();
    }

    public Token getNextToken() {
        State currState = startState;
        String value = "";
        for (int i = 0; i < expr.length(); i++) {
            currState = currState.getTransition(expr.charAt(i));
            value += expr.charAt(i);
            if (currState == null && currState.isFinite()) {
                currState = startState;
                return new Token(value, TokenType.NUMBER);
            } else {
                System.out.println("Unexpected token");
            }
        }
        return null;
    }

    public Token lookAHead() {
        return null;
    }
}
