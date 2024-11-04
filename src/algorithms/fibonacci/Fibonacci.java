package algorithms.fibonacci;

public class Fibonacci {

    private static long fibNaive(int n) {
        if (n <= 1) return n;

        return fibNaive(n - 1) + fibNaive(n - 2);
    }

    //O(n)
    private static long fibEffective(int n) {
        long[] arr = new long[n+1]; //O(n)

        arr[0] = 0; //O(1)
        arr[1] = 1; //O(1)

        // n = 2 => 1
        // n = 2 => 2
        // n = 3 => 3

        // O(n + n) => O(2n) => O(n)
        for (int i = 2; i <= n; i++)
            arr[i] = arr[i - 1] + arr[i - 2];

        return arr[n]; //O(1)
        // O(n) + O(1) + O(1) + O(n) + O(1) = O(2n) + O(3) = O(2n + 3) = O(n)
    }
}
