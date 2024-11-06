package algorithms.greedyAlgorithmsExample;

import java.util.Arrays;
import java.util.Comparator;

public class MaxNumberFromDigits {

    private static String maxNumberFromDigits(int[] digits) {
        // {3, 1, 7, 9, 9, 5} -> {1, 3, 5, 7, 9, 9}
        // O(n * long(n))

        Arrays.sort(digits);
        StringBuilder result = new StringBuilder();

        for (int i = digits.length - 1; i >= 0; i--) {
            result.append(digits[i]);
        }
        return result.toString();
    }

    private static String maxNumberFromDigitsStream(int[] digits) {
        return String.join("", Arrays.stream(digits)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .map(String::valueOf)
                .toArray(String[]::new));
    }
}
