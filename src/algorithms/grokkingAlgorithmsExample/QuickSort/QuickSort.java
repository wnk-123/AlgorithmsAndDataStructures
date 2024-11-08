package algorithms.grokkingAlgorithmsExample.QuickSort;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class QuickSort {

    private static List<Integer> quickSort_1(List<Integer> list) {
        if (list.size() < 2) {
            return list;                    // базовый случай: массив
                                            // с 0 и 1 элементом уже "отсортированы"
        } else {
            Integer pivot = list.get(0);    // <----- Рекурсивный случай

            // Подмассив всех элементов, меньших опорного
            List<Integer> less = list.stream().skip(1)
                    .filter(element -> element <= pivot).toList();

            // Подмассив всех элементов, польших опорного
            List<Integer> greater = list.stream().skip(1)
                    .filter(element -> element > pivot).toList();

            return Stream.of(quickSort_1(less).stream(), Stream.of(pivot), quickSort_1(greater)
                            .stream())
                            .flatMap(Function.identity())
                    .collect(Collectors.toList());
        }
    }

    private static void quickSort_2(int[] arr, int from, int to) {
        if (from < to) {
            int divideIndex = partition(arr, from, to);
            quickSort_2(arr, from, divideIndex - 1);
            quickSort_2(arr, divideIndex, to);
        }
    }

    private static int partition(int[] arr, int from, int to) {
        int leftIndex = from;
        int rightIndex = to;

        int pivot = arr[from];

        while (leftIndex <= rightIndex) {
            while (arr[leftIndex] < pivot) {
                leftIndex++;
            }
            while (arr[rightIndex] > pivot) {
                rightIndex--;
            }

            if (leftIndex <= rightIndex) {
                int temp = arr[leftIndex];
                arr[leftIndex] = arr[rightIndex];
                arr[rightIndex] = temp;
                leftIndex++;
                rightIndex--;
            }
        }
        return leftIndex;
    }
}
