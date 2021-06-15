package reversepolishcalculator;

import lexer.Lexer;
import lexer.Token;

import java.util.List;
import java.util.Stack;

public class ExpressionTranslator {

    private final Lexer lexer;
    private List<Token> tokens;
    private Stack<Token> stackOperation;

    public ExpressionTranslator(Lexer lexer) {
        this.lexer = lexer;
    }

    public List<Token> translateExpression() {
        return null;
    }

}
