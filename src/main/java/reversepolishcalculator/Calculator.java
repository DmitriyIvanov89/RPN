package reversepolishcalculator;

import lexer.Token;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Calculator {

    private final Stack<Double> stack = new Stack<>();
    private final List<Token> tokens = new ArrayList<>();

    public double calculate(List<Token> tokens) {
        for (Token element : tokens) {
            if (isNumber(element)) {
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
        if (!stack.empty()) {
            System.out.println("Wrong expression");
        }
        return stack.pop();
    }

    private boolean isNumber(Token token) {
        try {
            Double.parseDouble(token.getValue());
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

}
