package reversepolishcalculator;

import lexer.Lexer;
import lexer.Token;
import lexer.TokenType;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Convector {

    private final Lexer lexer;
    private String expr;
    private final List<Token> tokensIn = new ArrayList<>();
    private final List<Token> tokensOut = new ArrayList<>();
    private final Stack<Token> stackOperations = new Stack<>();
    //private final Stack<Token> stackOut = new Stack<>();

    public Convector(Lexer lexer) {
        this.lexer = lexer;
    }

    public List<Token> convertExpression(String expr) {
        for (int i = 0; i < expr.length(); i++) {
            tokensIn.add(lexer.getNextToken());
        }
        for (Token element : tokensIn) {
            if (element.getType() == TokenType.NUMBER) {
                tokensOut.add(element);
            } else {
                if (stackOperations.empty()) {
                    stackOperations.push(element);
                } else {
                    if (getPriority(element) < getPriority(stackOperations.peek())) {
                        tokensOut.add(stackOperations.pop());
                        stackOperations.push(element);
                    } else if (getPriority(element) > getPriority(stackOperations.peek())) {
                        stackOperations.push(element);
                    } else {
                        tokensOut.add(stackOperations.pop());
                        stackOperations.push(element);
                    }
                }
            }
        }
        while (!stackOperations.empty()) {
            tokensOut.add(stackOperations.pop());
        }

        return tokensOut;
    }

    public int getPriority(Token token) {
        if (token.getType() == TokenType.OP_MUL || token.getType() == TokenType.OP_DIV) {
            return 2;
        }
        if (token.getType() == TokenType.OP_PLUS || token.getType() == TokenType.OP_MINUS) {
            return 1;
        }

        return 0;
    }

}
