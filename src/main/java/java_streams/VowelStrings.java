package java_streams;

import java.util.Arrays;

public class VowelStrings {
    public static void printVowelStrings(String[] strings) {
        Arrays.stream(strings)
                .filter(s -> s.matches(".*[aeiouAEIOU].*")) // Filter strings containing vowels
                .forEach(s -> {
                    long vowelCount = s.chars().filter(c -> "aeiouAEIOU".indexOf(c) != -1).count(); // Count vowels
                    System.out.println(s + " - Number of vowels: " + vowelCount);
                });
    }
}

