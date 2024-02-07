package java_streams;

import java.util.Arrays;
import java.util.Comparator;

public class StringCapitalization {
    public static void main(String[] args) {
        String[] strings = {"apple", "banana", "orange", "grape", "kiwi"};

        Arrays.stream(strings)
                .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1)) // Capitalize first letter
                .sorted(Comparator.naturalOrder()) // Sort alphabetically
                .forEach(System.out::println); // Print each string
    }
}

