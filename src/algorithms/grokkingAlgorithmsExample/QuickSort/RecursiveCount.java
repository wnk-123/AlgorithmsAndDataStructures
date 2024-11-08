package algorithms.grokkingAlgorithmsExample.QuickSort;

import java.util.Arrays;

public class RecursiveCount {

    private static int countElements(int[] list) {
        if (list.length == 0) {
            return 0;
        }

        return 1 + countElements(Arrays.copyOfRange(list, 1, list.length));
    }
}
