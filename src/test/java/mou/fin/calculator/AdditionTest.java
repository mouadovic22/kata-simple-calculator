package mou.fin.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdditionTest {

    @Test
    public void testApply() {
        Addition addition = new Addition();
        int result = addition.apply(2, 3);
        assertEquals(5, result);
    }
}
