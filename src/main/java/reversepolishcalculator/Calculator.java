package reversepolishcalculator;

import lexer.Token;
import lexer.TokenType;

import java.util.List;
import java.util.Stack;

public class Calculator {

    private final Stack<Double> stack;
    private final Convector convector;
    private final String expression;

    public Calculator(Convector convector, String expression) {
        this.convector = convector;
        this.expression = expression;
        this.stack = new Stack<>();
    }

    public double calculate() {
        List<Token> tokens = convector.convertExpression(expression);
        for (Token element : tokens) {
            if (element.getType() == TokenType.NUMBER) {
                stack.push(Double.parseDouble(element.getValue()));
            } else {
                double operand1 = stack.pop();
                double operand2 = stack.pop();

                switch (element.getType()) {
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
//        if (!stack.empty()) {
//            System.out.println("Wrong expression");
//        }

        return stack.pop();
    }
}
