package lexer;

import dfa.*;
<<<<<<< HEAD
=======

>>>>>>> c1bb36dfe3fb6c7c0ba89c614133c07465da5382
import java.text.CharacterIterator;
import java.text.StringCharacterIterator;

public class Lexer {

<<<<<<< HEAD
    private String expr;
    private CharacterIterator iterator;
    private DFA dfa;
=======
    private DFA dfa;
    private CharacterIterator iterator;
>>>>>>> c1bb36dfe3fb6c7c0ba89c614133c07465da5382

    public Lexer(String expr, DFA dfa) {
        this.iterator = new StringCharacterIterator(expr);
        this.dfa = dfa;
<<<<<<< HEAD
    }

    public Token getNextToken() {
        return null;
    }

    public Token lookAHead() {
        return null;
=======

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
            //Exception
            return new Token("", TokenType.UNDEFINED);
        }
>>>>>>> c1bb36dfe3fb6c7c0ba89c614133c07465da5382
    }
}