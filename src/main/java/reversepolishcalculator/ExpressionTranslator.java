package reversepolishcalculator;

import lexer.Lexer;
import lexer.Token;
import lexer.TokenType;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ExpressionTranslator {

    private final Lexer lexer;
    private String expr;
    private final List<Token> tokensInt = new ArrayList<>();
    private final List<Token> tokensOut = new ArrayList<>();
    private final Stack<Token> stackOperation = new Stack<>();

    public ExpressionTranslator(Lexer lexer) {
        this.lexer = lexer;
    }

    public List<Token> translateExpression(String expr) {
        for (int i = 0; i < expr.length(); i++) {
            tokensInt.add(lexer.getNextToken());
        }
        for (Token element : tokensInt) {
            if (element.getType() == TokenType.NUMBER) {

            }
        }
    }

}
