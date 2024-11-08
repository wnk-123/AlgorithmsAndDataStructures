package algorithms.grokkingAlgorithmsExample.QuickSort;

public class LoopSum {

    private static int sum1(int[] arr) {
        int total = 0;

        for (int i: arr) {
            total += i;
        }
        return total;
    }

    private static int sum2(int[] arr) {
        int total = 0;

        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        return total;
    }
}
