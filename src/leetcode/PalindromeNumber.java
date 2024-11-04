package leetcode;

public class PalindromeNumber {

    private static boolean isPalindrome(int x) {
        if (x < 0) return false;
        int num = x;

        int reversed = 0;
        while (num != 0) {
            int lastDigits = num % 10;
            num /= 10;
            reversed = reversed * 10 + lastDigits;
        }
        if (x == reversed) return true;
        return false;
    }
}
