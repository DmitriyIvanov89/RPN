package lexicalAnalyzer;

import DFA.*;

public class Lexer {

    private final String expr;
    private DFA dfa;
    private State currState;
    private Token currToken;
    private String value = "";
    private int position = 0;

    public Lexer(String expr) {
        this.expr = expr;
    }

    public Token getNextToken() {
        currState = dfa.getStartState();
        while (position < expr.length()) {
            if (currState.hasTransition(expr.charAt(position))) {
                currState = currState.getTransition(expr.charAt(position));
                value += expr.charAt(position);
                position++;
            } else {
                if (!currState.isFinite()) {
                    System.out.println("wrong lexer");
                } else {
                    currToken = new Token(value, TokenType.NUMBER);
                    currState = dfa.getStartState();
                }
            }
        }
        return currToken;
    }

    public Token lookAHead() {
        return null;
    }
}
