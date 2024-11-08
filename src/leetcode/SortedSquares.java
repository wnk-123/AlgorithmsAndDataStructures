package leetcode;

import java.util.Arrays;

public class SortedSquares {

    private static int[] sortedSquares_1(int[] nums) {
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[i] * nums[i];
        }
        Arrays.sort(result);
        return result;
    }

    private static int[] sortedSquares_2(int[] nums) {
        int[] result = new int[nums.length];

        int left = 0;
        int right = nums.length - 1;

        int index = nums.length - 1;

        while (left <= right) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if (leftSquare > rightSquare) {
                result[index] = leftSquare;
                left++;
            } else {
                result[index] = rightSquare;
                right--;
            }
            index--;
        }
        return result;
    }
}
