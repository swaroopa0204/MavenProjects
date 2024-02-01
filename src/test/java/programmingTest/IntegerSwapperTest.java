package programmingTest;

import programming.IntegerSwapper;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class IntegerSwapperTest {

    @Test
    public void testSwapIntegers() {
        IntegerSwapper swapper = new IntegerSwapper();

        // Test with positive integers
        System.out.println("Test Case 1:");
        int[] result1 = swapper.swapIntegers(5, 10);
        assertEquals("Swapped value of 'a' should be 10", 10, result1[0]);
        assertEquals("Swapped value of 'b' should be 5", 5, result1[1]);

        // Test with negative integers
        System.out.println("\nTest Case 2:");
        int[] result2 = swapper.swapIntegers(-15, -30);
        assertEquals("Swapped value of 'a' should be -30", -30, result2[0]);
        assertEquals("Swapped value of 'b' should be -15", -15, result2[1]);

        // Test with one positive and one negative integer
        System.out.println("\nTest Case 3:");
        int[] result3 = swapper.swapIntegers(-20, 40);
        assertEquals("Swapped value of 'a' should be 40", 40, result3[0]);
        assertEquals("Swapped value of 'b' should be -20", -20, result3[1]);
    }
}


