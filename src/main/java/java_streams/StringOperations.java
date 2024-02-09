package java_streams;

import java.util.List;

public class StringOperations {
    public static String findMaxElement(List<String> strings) {
        return strings.stream()
                .max(String::compareTo)
                .orElse(null);
    }
}

