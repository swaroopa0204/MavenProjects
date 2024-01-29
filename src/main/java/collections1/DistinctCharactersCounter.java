package collections1;

import java.util.HashMap;

public class DistinctCharactersCounter {

    public String countDistinctCharacters(String str) {
        // Create a HashMap to store character counts
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        // Iterate through the string and count occurrences of each character
        for (char ch : str.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        // Construct the output string
        StringBuilder result = new StringBuilder();
        for (char ch : charCountMap.keySet()) {
            result.append(ch).append("-").append(charCountMap.get(ch)).append(", ");
        }

        // Remove the trailing comma and space
        if (result.length() > 0) {
            result.delete(result.length() - 2, result.length());
        }

        return result.toString();
    }
}

