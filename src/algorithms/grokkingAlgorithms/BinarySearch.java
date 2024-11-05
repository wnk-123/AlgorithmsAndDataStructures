package algorithms.grokkingAlgorithms;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {3, 1, 7, 5, 2};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(binarySearch(arr, 7));
    }

    private static int binarySearch(int[] arr, int item) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (item < arr[mid]) {
                high = mid - 1;
            } else if (item > arr[mid]) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    private static int binarySearchRec(int[] sortedArray, int item, int low, int high) {
        int mid = low + (high - low) / 2;

        if (low > high) {
            return -1;
        }

        if (item == sortedArray[mid]) {
            return mid;
        } else if (item < sortedArray[mid]) {
            return binarySearchRec(sortedArray, item, low, mid - 1);
        } else {
            return binarySearchRec(sortedArray, item, mid + 1, high);
        }
    }
}
