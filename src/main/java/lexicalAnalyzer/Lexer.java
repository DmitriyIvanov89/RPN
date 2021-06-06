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
    }

    public Token lookAHead() {
        return null;
    }
}
