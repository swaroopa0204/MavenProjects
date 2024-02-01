package programmingTest;
import programming.FactorialCalculator;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FactorialCalculatorTest {

    @Test
    public void testCalculateFactorial() {
        FactorialCalculator calculator = new FactorialCalculator();

        // Test with positive integer
        int input1 = 5;
        int expectedOutput1 = 120;
        assertEquals(expectedOutput1, calculator.calculateFactorial(input1));

        // Test with zero
        int input2 = 0;
        int expectedOutput2 = 1;
        assertEquals(expectedOutput2, calculator.calculateFactorial(input2));

        // Test with negative integer (not applicable for factorial)
    }
}

