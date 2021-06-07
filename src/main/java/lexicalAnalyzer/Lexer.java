package lexicalAnalyzer;

import DFA.*;

public class Lexer {

    private final String expr;
    private DFA dfa;

    public Lexer(String expr) {
        this.expr = expr;
    }

    public Token getNextToken() {
        return null;
    }

    public Token lookAHead() {
        return null;
    }
}
