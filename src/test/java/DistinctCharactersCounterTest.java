import org.junit.Test;
import static org.junit.Assert.assertTrue;
import collections1.DistinctCharactersCounter;

public class DistinctCharactersCounterTest {

    @Test
    public void testCountDistinctCharacters() {
        DistinctCharactersCounter counter = new DistinctCharactersCounter();

        // Test with input: "test string"
        String input1 = "test string";
        String expectedOutput1 = "t-3, e-1, s-2, r-1, i-1, n-1, g-1";
        assertOutputContainsExpectedPairs(counter.countDistinctCharacters(input1), expectedOutput1);

        // Test with input: "hello"
        String input2 = "hello";
        String expectedOutput2 = "h-1, e-1, l-2, o-1";
        assertOutputContainsExpectedPairs(counter.countDistinctCharacters(input2), expectedOutput2);

        // Test with input: ""
        String input3 = "";
        String expectedOutput3 = "";
        assertOutputContainsExpectedPairs(counter.countDistinctCharacters(input3), expectedOutput3);

        // Test with input: "aaaa"
        String input4 = "aaaa";
        String expectedOutput4 = "a-4";
        assertOutputContainsExpectedPairs(counter.countDistinctCharacters(input4), expectedOutput4);
    }

    private void assertOutputContainsExpectedPairs(String output, String expectedPairs) {
        String[] expectedPairsArray = expectedPairs.split(", ");
        for (String pair : expectedPairsArray) {
            assertTrue(output.contains(pair));
        }
    }
}
