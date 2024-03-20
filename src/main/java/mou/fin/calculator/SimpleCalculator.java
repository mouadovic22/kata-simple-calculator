package mou.fin.calculator;

import java.util.Arrays;
import java.util.List;

public class SimpleCalculator {
    List<Operation> operations;

    public SimpleCalculator() {
        this.operations = Arrays.asList(new Addition(), new Subtraction(), new Multiplication());
    }

    public int calculate(String input) {
        if (input == null || input.isBlank()) {
            return 0;
        }

        String[] parts = input.trim().split("[+\\-*\\/%]");
        if (parts.length == 1) {
            return parseOperand(parts[0]);
        } else if (parts.length != 2) {
            throw new IllegalArgumentException("More than two operands.");
        }

        int operand1 = parseOperand(parts[0]);
        int operand2 = parseOperand(parts[1]);
        
        return operations.stream()
                .filter(operation -> operation.applies(input))
                .findFirst()
                .map(operation -> operation.apply(operand1, operand2))
                .orElseThrow(() -> new UnsupportedOperationException("Unsupported operation."));

    }

    private int parseOperand(String part) {
        try {
            return Integer.parseInt(part.trim());
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Non-integer operand.");
        }
    }


}
