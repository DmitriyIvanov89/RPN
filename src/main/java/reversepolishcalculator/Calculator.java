package reversepolishcalculator;

import lexer.Token;
import lexer.TokenType;

import java.util.List;
import java.util.Stack;

public class Calculator {

    private final Converter convector;

    public Calculator(Converter converter) {
        this.convector = converter;
    }

    public double calculate(String expression) {
        Stack<Double> stack = new Stack<>();
        List<Token> tokens = convector.convertExpressionToRPN(expression);
        for (Token token : tokens) {
            if (token.getType() == TokenType.NUMBER) {
                stack.push(Double.parseDouble(token.getValue()));
            } else {
                double operand1 = stack.pop();
                double operand2 = stack.pop();

                switch (token.getType()) {
                    case OP_PLUS:
                        stack.push(operand1 + operand2);
                        break;
                    case OP_MINUS:
                        stack.push(operand2 - operand1);
                        break;
                    case OP_MUL:
                        stack.push(operand1 * operand2);
                        break;
                    case OP_DIV:
                        stack.push(operand2 / operand1);
                        break;
                }
            }
        }

        return stack.pop();
    }
}
