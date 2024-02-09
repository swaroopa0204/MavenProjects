package java_streams;

import java.util.Arrays;
import java.util.Comparator;

public class StringSorter {
    public static void sortStrings(String[] strings) {
        Arrays.sort(strings, Comparator.comparingInt(String::length)
                .thenComparing(Comparator.comparing((String s) -> s.length()).reversed())
                .thenComparing(Comparator.comparing((String s) -> s.charAt(s.length() - 1)).reversed()));
    }
}

