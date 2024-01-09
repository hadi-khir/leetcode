package org.personal.leetcode.easy;

public class PalindromeNumber {

    /**
     * Initial brute force solution utilizing string conversion to parse char values.
     */
    public boolean isPalindrome(int x) {

        if (x < 0) {
            return false;
        }

        String palindrome = String.valueOf(x);
        for (int i = 0; i < palindrome.length() / 2; i++) {
            if (!(palindrome.charAt(i) == palindrome.charAt(palindrome.length() - i - 1))) {
                return false;
            }
        }

        return true;
    }

    /**
     * Optimized solution utilizing remainder to reverse number.
     */
    public boolean isPalindromeOptimized(int x) {

        if (x < 0) {
            return false;
        }

        int temp = x;
        int reverse = 0;
        while (temp > 0) {

            int remainder = temp % 10;
            reverse = reverse * 10 + remainder;
            temp /= 10;
        }

        return reverse == x;
    }
}
