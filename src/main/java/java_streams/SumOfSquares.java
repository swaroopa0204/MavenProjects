package java_streams;

import java.util.List;

public class SumOfSquares {
    public static int sumOfSquaresOfPositiveIntegers(List<Integer> numbers) {
        return numbers.stream()
                .filter(num -> num > 0)
                .mapToInt(num -> num * num)
                .sum();
    }
}

