package algorithms.grokkingAlgorithmsExample.BinarySearch;

public class BinarySearch_4 {

    private static int binarySearch(int[] arr, int item) {
        if (isListEmpty(arr)) {
            return -1;
        }

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int guess = arr[mid];

            if (guessEqualsItem(guess,item)) {
                return mid;
            } else if (guessGreaterThanItem(guess, item)) {
                high = mid - 1;
            } else if (guessLessThanItem(guess, item)) {
                low = mid + 1;
            }
        }
        return -1;
    }

    private static boolean isListEmpty(int[] arr) {
        int arrSize = arr.length;

        if (arrSize == 0) {
            return true;
        }
        return false;
    }

    private static boolean guessEqualsItem(int guess, int item) {
        if (guess != item) {
            return false;
        }
        return true;
    }

    private static boolean guessGreaterThanItem(int guess, int item) {
        if (guess < item) {
            return false;
        }
        return true;
    }

    private static boolean guessLessThanItem(int guess, int item) {
        if (guess > item) {
            return false;
        }
        return true;
    }
}
