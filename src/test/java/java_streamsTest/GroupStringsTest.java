package java_streamsTest;

import java_streams.GroupStrings;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupStringsTest {

    @Test
    public void testGroupByLength() {
        List<String> strings = Arrays.asList("apple", "banana", "orange", "kiwi", "grape", "pear");
        Map<Integer, List<String>> expected = strings.stream()
                .collect(Collectors.groupingBy(String::length));

        Map<Integer, List<String>> result = GroupStrings.groupByLength(strings);

        assertEquals("Map of strings grouped by length should match expected value", expected, result);
    }
}
