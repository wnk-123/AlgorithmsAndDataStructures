package algorithms.grokkingAlgorithmsExample.Recursion;

public class Countdown {

    private static void countdown(int n) {
        System.out.println(n);

        if (n <= 0) {                   // <-------- базовый случай
            return;

        } else {                        // <-------- рекурсивный случай
            System.out.println("...");
            countdown(n - 1);
        }
    }
}
