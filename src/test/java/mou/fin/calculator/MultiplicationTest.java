package mou.fin.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplicationTest {

    @Test
    public void testApply() {
        Multiplication multiplication = new Multiplication();
        int result = multiplication.apply(2, 3);
        assertEquals(6, result);
    }
}