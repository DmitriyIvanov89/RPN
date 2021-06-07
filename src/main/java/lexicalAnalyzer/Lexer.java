package lexicalAnalyzer;

import DFA.*;

public class Lexer {

    private final String expr;
    private DFA dfa;
    private State currState;
    private Token currToken;
    private String value;
    private int position;

    public Lexer(String expr, DFA dfa) {
        this.expr = expr;
        this.currState = dfa.getStartState();
    }

    public Token getNextToken() {
        for (int i = 0; i < expr.length(); i++) {
            if (currState.hasTransition(expr.charAt(i))) {
                currState = currState.getTransition(expr.charAt(i));
                value += expr.charAt(i);
            } else {
                if (!currState.isFinite()) {
                    System.out.println("Wrong expression!");
                    break;
                } else {
                    currToken = new Token(value, currState.getType());
                }
            }
        }
        return currToken;
    }

    public Token lookAHead() {
        return null;
    }
}
