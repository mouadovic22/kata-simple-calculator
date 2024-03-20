package mou.fin.calculator;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SimpleCalculatorTest {
    private final SimpleCalculator simpleCalculator;

    public SimpleCalculatorTest() {
        List<Operation> operations = Arrays.asList(new Addition(), new Subtraction(), new Multiplication(), new Addition());
        simpleCalculator = new SimpleCalculator(operations);
    }

    @Test
    void testAddition() {
        int result = simpleCalculator.calculate("2 + 3");
        assertEquals(5, result);
    }

    @Test
    void testSubtraction() {
        int result = simpleCalculator.calculate("2 - 3");
        assertEquals(-1, result);
    }

    @Test
    void testMultiplication() {
        int result = simpleCalculator.calculate("2 * 3");
        assertEquals(6, result);
    }

    @Test
    void testSingletonOperand() {
        int result = simpleCalculator.calculate("3");
        assertEquals(3, result);
    }

    @Test
    void testEmptyExpression() {
        int result = simpleCalculator.calculate("");
        assertEquals(0, result);
    }

    @Test
    void testBlankExpression() {
        int result = simpleCalculator.calculate("    ");
        assertEquals(0, result);
    }

    @Test
    void testMoreThanTwoOperands() {
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> simpleCalculator.calculate("2 + 3 +4"));
        assertEquals("More than two operands.", thrown.getMessage());
    }

    @Test
    void testNonIntegerOperand() {
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> simpleCalculator.calculate("2 + a"));
        assertEquals("Non-integer operand.", thrown.getMessage());
    }

    @Test
    public void testUnsupportedOperation() {
        UnsupportedOperationException thrown = assertThrows(UnsupportedOperationException.class, () -> simpleCalculator.calculate("2 / 3"));
        assertEquals("Unsupported operation.", thrown.getMessage());
    }

}