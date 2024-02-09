package programming;

import java.util.HashMap;
import java.util.Map;

public class RepeatedCharacters {

    public static Map<Character, Integer> findRepeatedCharacters(String str) {
        Map<Character, Integer> charCountMap = new HashMap<>();

        for (char ch : str.toCharArray())
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);

        charCountMap.values().removeIf(count -> count <= 1);

        return charCountMap;
    }
}

