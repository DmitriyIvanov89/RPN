package lexer;

import dfa.*;

import java.text.CharacterIterator;
import java.text.StringCharacterIterator;

public class Lexer {

    private final CharacterIterator iterator;
    private final DFA dfa;
    public static final String DELIMITER = " ";

    public Lexer(String expr, DFA dfa) {
        this.iterator = new StringCharacterIterator(expr);
        this.dfa = dfa;
    }

    public Token lookAhead() {
        return getToken(false);
    }

    public Token getNextToken() {
        return getToken(true);
    }

    private Token getToken(boolean moveCurrentIndex) {
        if (iterator.getIndex() >= iterator.getEndIndex()) {
            return new Token("", TokenType.EOF);
        }
        int currentIndex = iterator.getIndex();
        TraversalResult traversalResult = dfa.greedyTraversal(iterator);
        if (!moveCurrentIndex) {
            iterator.setIndex(currentIndex);
        }
        if (traversalResult.getState().isFinite()) {
            return new Token(traversalResult.getTrace(), TokenType.valueOf(traversalResult.getState().getName()));
        } else {
            throw new RuntimeException(String.format("Undefined type of token by symbol: %s, position: %d", iterator.current(), iterator.getIndex()));
            //return new Token("", TokenType.UNDEFINED);
        }
    }
}