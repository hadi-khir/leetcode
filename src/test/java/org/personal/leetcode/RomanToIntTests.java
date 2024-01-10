package org.personal.leetcode;

import org.junit.jupiter.api.Test;
import org.personal.leetcode.easy.RomanToInt;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanToIntTests {

    @Test
    void testRomanToInt() {

        RomanToInt romanToInt = new RomanToInt();

        String s = "III";
        int output = romanToInt.romanToInt(s);
        assertEquals(3, output);

        s = "LVIII";
        output = romanToInt.romanToInt(s);
        assertEquals(58, output);

        s = "MCMXCIV";
        output = romanToInt.romanToInt(s);
        assertEquals(1994, output);
    }

    @Test
    void testRomanToIntOptimized() {

        RomanToInt romanToInt = new RomanToInt();

        String s = "III";
        int output = romanToInt.romanToIntOptimized(s);
        assertEquals(3, output);

        s = "LVIII";
        output = romanToInt.romanToIntOptimized(s);
        assertEquals(58, output);

        s = "MCMXCIV";
        output = romanToInt.romanToIntOptimized(s);
        assertEquals(1994, output);
    }
}
