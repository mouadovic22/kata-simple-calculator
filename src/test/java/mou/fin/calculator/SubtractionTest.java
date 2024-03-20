package mou.fin.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubtractionTest {

    @Test
    public void testApply() {
        Subtraction subtraction = new Subtraction();
        int result = subtraction.apply(5, 3);
        assertEquals(2, result);
    }
}