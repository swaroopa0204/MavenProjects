package programmingTest;

import org.junit.Test;
import programming.UniqueWordCounter;

import static org.junit.Assert.assertEquals;

public class UniqueWordCounterTest {

    @Test
    public void testCountUniqueWords() {
        String str = "hello world hello world hello";
        int expected = 0; // Only "hello" and "world" are unique
        int result = UniqueWordCounter.countUniqueWords(str);
        assertEquals("Number of unique words should match expected value", expected, result);
    }
}
