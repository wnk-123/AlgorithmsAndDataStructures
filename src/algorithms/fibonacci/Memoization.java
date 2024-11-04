package algorithms.fibonacci;

import java.util.Arrays;

public class Memoization {
    public static void main(String[] args) {
        int n = 100;
        long[] mem = new long[n+1];
        Arrays.fill(mem, -1);
        System.out.println(fibMem(n, mem));
    }

    private static long fibMem(int n, long[] mem) {
        if (mem[n] != -1) return mem[n];
        if (n <= 1) return n;

        long result = fibMem(n - 1, mem) + fibMem(n - 2, mem);
        mem[n] = result;
        return result;
    }
}
