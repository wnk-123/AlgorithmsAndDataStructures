package leetcode;

public class FindNumbers {

    private static int findNumbers(int[] nums) {
        int numberOfEven = 0;
        for (int num: nums) {
            int numberOfDigits = 0;
            while (num != 0) {
                num /= 10;
                numberOfDigits++;
            }
            if (numberOfDigits % 2 == 0) {
                numberOfEven++;
            }
        }
        return numberOfEven++;
    }
}
