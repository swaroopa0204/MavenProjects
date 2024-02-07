package java_streams;

import java.util.Arrays;
import java.util.OptionalDouble;

public class AverageCalculator {
    public static OptionalDouble averageOfSquaresOfOddNumbers(int[] numbers) {
        return Arrays.stream(numbers)
                .filter(n -> n % 2 != 0) // Filter odd numbers
                .map(n -> n * n) // Square each odd number
                .average(); // Calculate average
    }
}

