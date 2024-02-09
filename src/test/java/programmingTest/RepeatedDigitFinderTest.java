package programmingTest;

import org.junit.Test;
import programming.RepeatedDigitFinder;

import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class RepeatedDigitFinderTest {

    @Test
    public void testFindRepeatedDigits() {
        int input1 = 123333456;
        List<Integer> result1 = RepeatedDigitFinder.findRepeatedDigits(input1);
        assertEquals(Arrays.asList(3), result1);

        int input2 = 112233;
        List<Integer> result2 = RepeatedDigitFinder.findRepeatedDigits(input2);
        assertEquals(Arrays.asList(1, 2, 3), result2);

        int input3 = 987654321;
        List<Integer> result3 = RepeatedDigitFinder.findRepeatedDigits(input3);
        assertEquals(Arrays.asList(), result3);

        int input4 = 1122334455;
        List<Integer> result4 = RepeatedDigitFinder.findRepeatedDigits(input4);
        assertEquals(Arrays.asList(1, 2, 3, 4, 5), result4);
    }
}
