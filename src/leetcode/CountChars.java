package leetcode;

public class CountChars {

    private static int[] countChars(String s) {
        int[] charCount = new int[26];

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            charCount[c - 'A'] += 1;
        }
        return charCount;
    }
}
