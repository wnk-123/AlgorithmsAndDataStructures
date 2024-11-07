package algorithms.grokkingAlgorithmsExample.BinarySearch;

import java.util.Arrays;

public class BinarySearch_3 {
    public static void main(String[] args) {
        int[] arr = {3, 2, 7, 5, 9, 1};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println(search(arr, 7));
    }

    private static Integer search(int[] arr, int item) {
        int numberOfOperations = 0;

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            numberOfOperations++;

            int mid = (low + high) / 2;
            int guess = arr[mid];

            if (guess == item) {
                System.out.println("Количество операций: " + numberOfOperations);
                return mid;
            }

            if (guess > item) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        System.out.println("Количество операций: " + numberOfOperations);
        return null;
    }
}
