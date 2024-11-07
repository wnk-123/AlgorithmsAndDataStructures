package algorithms.grokkingAlgorithmsExample.BinarySearch;

import java.util.Arrays;

public class BinarySearch_1 {
    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 6, 7};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println(binarySearch(arr, 5));
    }

    private static int binarySearch(int[] arr, int item) {
        if (item <= 1) return item;

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (item == arr[mid]) {
                return mid;
            } else if (item < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
