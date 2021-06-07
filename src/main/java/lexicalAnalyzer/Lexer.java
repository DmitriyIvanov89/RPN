package lexicalAnalyzer;

import DFA.*;

public class Lexer {

    private final String expr;
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
>>>>>>> 63e5c70e6a1c6318dd5f012522c82e18b20f514d
    }

    public Token lookAHead() {
        return null;
    }
}
