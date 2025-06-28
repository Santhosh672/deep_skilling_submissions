package clc;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calc = new Calculator();
        int result = calc.add(2, 3);
        assertEquals(5, result); 
        assertEquals(5, 2 + 3);
        
        boolean result2 = calc.greater(5, 3);
        assertTrue(result2);

        assertFalse(5 < 3);

        assertNull(null);

        assertNotNull(new Object());
    }
}
