package lexicalAnalyzer;

import DFA.DFA;
import DFA.DFAConfigReader;
import DFA.DFAConfig;
import DFA.State;


public class Lexer {

    private final String expr;
    private DFA dfa;
    private State startState;
    private DFAConfigReader reader;

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
