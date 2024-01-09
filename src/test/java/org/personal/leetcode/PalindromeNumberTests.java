package org.personal.leetcode;

import org.junit.jupiter.api.Test;
import org.personal.leetcode.easy.PalindromeNumber;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalindromeNumberTests {

    @Test
    void testIsPalindromeBruteForce() {

        PalindromeNumber palindromeNumber = new PalindromeNumber();

        int x = -121;
        boolean isPalindrome = palindromeNumber.isPalindrome(x);
        assertFalse(isPalindrome);

        x = 121;
        isPalindrome = palindromeNumber.isPalindrome(x);
        assertTrue(isPalindrome);

        x = 10;
        isPalindrome = palindromeNumber.isPalindrome(x);
        assertFalse(isPalindrome);

        x = 0;
        isPalindrome = palindromeNumber.isPalindrome(x);
        assertTrue(isPalindrome);
    }

    @Test
    void testIsPalindromeOptimized() {

        PalindromeNumber palindromeNumber = new PalindromeNumber();

        int x = -121;
        boolean isPalindrome = palindromeNumber.isPalindromeOptimized(x);
        assertFalse(isPalindrome);

        x = 121;
        isPalindrome = palindromeNumber.isPalindromeOptimized(x);
        assertTrue(isPalindrome);

        x = 10;
        isPalindrome = palindromeNumber.isPalindromeOptimized(x);
        assertFalse(isPalindrome);

        x = 0;
        isPalindrome = palindromeNumber.isPalindromeOptimized(x);
        assertTrue(isPalindrome);
    }
}
