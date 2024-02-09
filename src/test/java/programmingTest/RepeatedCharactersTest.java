package programmingTest;

import org.junit.Test;
import programming.RepeatedCharacters;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

public class RepeatedCharactersTest {

    @Test
    public void testFindRepeatedCharacters() {
        String str = "programming";
        Map<Character, Integer> expected = new HashMap<>();
        expected.put('g', 2);
        expected.put('r', 2);
        expected.put('m', 2);

        Map<Character, Integer> result = RepeatedCharacters.findRepeatedCharacters(str);

        assertEquals("Map of repeated characters should match expected value", expected, result);
    }
}

