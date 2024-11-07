package algorithms.grokkingAlgorithmsExample.BinarySearch;

public class BinarySearch_2 {

    private static int binarySearchRec(int[] sortArr, int item, int low, int high) {
        if (low > high) return -1;
        int mid = low + (high - low) / 2;

        if (item == sortArr[mid]) {
            return mid;
        } else if (item < sortArr[mid]) {
            return binarySearchRec(sortArr, item, low, mid - 1);
        } else {
            return binarySearchRec(sortArr, item, mid + 1, high);
        }
    }
}
