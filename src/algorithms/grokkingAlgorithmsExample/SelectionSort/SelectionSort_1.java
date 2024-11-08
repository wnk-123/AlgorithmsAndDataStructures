package algorithms.grokkingAlgorithmsExample.SelectionSort;

import java.util.Arrays;

public class SelectionSort_1 {
    public static void main(String[] args) {
        int[] arr = {3, 6, 1, 2, 5, 7, 8, 0};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minimumElementIndex = i;

            for (int j = i+1; j < arr.length; j++) {
                if (arr[minimumElementIndex] > arr[j]) {
                    minimumElementIndex = j;
                }
            }

            if (minimumElementIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minimumElementIndex];
                arr[minimumElementIndex] = temp;
            }
        }
    }
}
