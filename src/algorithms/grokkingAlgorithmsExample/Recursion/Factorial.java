package algorithms.grokkingAlgorithmsExample.Recursion;

public class Factorial {

    private static int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}