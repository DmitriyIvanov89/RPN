package lexicalAnalyzer;

import DFA.*;

public class Lexer {

    private final String expr;
    private DFA dfaLexer;
    private State currState;
    private Token currToken;
    private String value;
    private int position;

    public Lexer(String expr, DFA dfaLexer) {
        this.expr = expr;
        this.currState = dfaLexer.getStartState();
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
                    currToken = new Token(value, TokenType.valueOf(currState.getType()));
                }
            }
        }
        return currToken;
    }

    public Token lookAHead() {
        return null;
    }
}
