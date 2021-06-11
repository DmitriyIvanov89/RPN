package lexer;

import dfa.*;

import java.text.CharacterIterator;
import java.text.StringCharacterIterator;

public class Lexer {

    private String expr;
    private CharacterIterator iterator;
    private DFA dfa;

    public Lexer(String expr, DFA dfa) {
        this.iterator = new StringCharacterIterator(expr);
        this.dfa = dfa;
    }

    public Token getNextToken() {
        return null;
    }

    public Token lookAHead() {
        return null;
    }
}