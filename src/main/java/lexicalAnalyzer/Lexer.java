package lexicalAnalyzer;

import DFA.*;

public class Lexer {

    private final String expr;
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
        for (int i = 0; i < expr.length(); i++) {
            if (currState.hasTransition(expr.charAt(i))) {
                currState = currState.getTransition(expr.charAt(i));
                value += expr.charAt(i);
            } else {
                if (!currState.isFinite()) {
                    System.out.println("Wrong lexer");
                } else {
                    currentToken = new Token(value, TokenType.NUMBER);
                    currState = dfa.getStartState();
                }
            }
        }
        return currentToken;
    }

    public Token lookAHead() {
        return null;
    }
}
