package algorithms.grokkingAlgorithmsExample.SelectionSort;

import java.util.Arrays;

public class SelectionSort_3 {
    public static void main(String[] args) {
        int[] arr = {4, 3, 5, 2, 8, 0, 9};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int index = minIndex(arr, i);
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
    }

    private static int minIndex(int[] arr, int start) {
        int min = arr[start];
        int minIndex = start;

        for (int i = start+1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
}
