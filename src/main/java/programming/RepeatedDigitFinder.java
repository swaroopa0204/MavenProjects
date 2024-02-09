package programming;

import java.util.ArrayList;
import java.util.List;

public class RepeatedDigitFinder {

    public static List<Integer> findRepeatedDigits(int number) {
        int[] digitCount = new int[10];
        List<Integer> repeatedDigits = new ArrayList<>();

        while (number > 0) {
            int digit = number % 10;
            digitCount[digit]++;
            number /= 10;
        }

        for (int i = 0; i < 10; i++) {
            if (digitCount[i] > 1) {
                repeatedDigits.add(i);
            }
        }

        return repeatedDigits;
    }
}

