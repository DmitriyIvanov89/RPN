package reversepolishcalculator;

import lexer.Lexer;
import lexer.Token;
import lexer.TokenType;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Converter {

    private final Lexer lexer;

    public Converter(Lexer lexer) {
        this.lexer = lexer;
    }

    public List<Token> convertExpressionToRPN(String expr) {
        List<Token> tokensOut = new ArrayList<>();
        Stack<Token> stackOperations = new Stack<>();

        while (lexer.lookAhead().getType() != TokenType.EOF) {
            Token token = lexer.getNextToken();

            if (token.getType() == TokenType.DELIMITER) {
                continue;
            }
            if (token.getType() == TokenType.NUMBER) {
                tokensOut.add(token);
            } else {
                if (stackOperations.empty()) {
                    stackOperations.push(token);
                } else {
                    if (getPriority(token) < getPriority(stackOperations.peek())) {
                        tokensOut.add(stackOperations.pop());
                        stackOperations.push(token);
                    } else if (getPriority(token) > getPriority(stackOperations.peek())) {
                        stackOperations.push(token);
                    } else {
                        tokensOut.add(stackOperations.pop());
                        stackOperations.push(token);
                    }
                }
            }
        }
        while (!stackOperations.empty()) {
            tokensOut.add(stackOperations.pop());
        }
        return tokensOut;
    }

    private int getPriority(Token token) {
        if (token.getType() == TokenType.OP_MUL || token.getType() == TokenType.OP_DIV) {
            return 2;
        }
        if (token.getType() == TokenType.OP_PLUS || token.getType() == TokenType.OP_MINUS) {
            return 1;
        }

        return 0;
    }
}
