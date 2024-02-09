package programming;

import java.util.HashMap;
import java.util.Map;

public class UniqueWordCounter {

    public static int countUniqueWords(String str) {
        // Split the input string into words
        String[] words = str.split("\\s+");

        // Create a HashMap to store word frequencies
        Map<String, Integer> wordFreqMap = new HashMap<>();

        // Count the frequency of each word
        for (String word : words) {
            wordFreqMap.put(word, wordFreqMap.getOrDefault(word, 0) + 1);
        }

        // Count the number of unique words
        int uniqueWordCount = 0;
        for (Map.Entry<String, Integer> entry : wordFreqMap.entrySet()) {
            if (entry.getValue() == 1) {
                uniqueWordCount++;
            }
        }

        return uniqueWordCount;
    }
}
