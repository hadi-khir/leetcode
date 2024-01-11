package org.personal.leetcode;

import org.junit.jupiter.api.Test;
import org.personal.leetcode.easy.LongestCommonPrefix;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestCommonPrefixTests {

    @Test
    void testLongestCommonPrefix() {

        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();

        String[] words = new String[]{"flower", "flow", "flight"};
        String expectedOutput = "fl";

        String prefix = longestCommonPrefix.longestCommonPrefix(words);
        assertEquals(expectedOutput, prefix);

        words = new String[]{"dog", "racecar", "car"};
        expectedOutput = "";
        prefix = longestCommonPrefix.longestCommonPrefix(words);
        assertEquals(expectedOutput, prefix);

        words = new String[]{"cir", "car"};
        expectedOutput = "c";
        prefix = longestCommonPrefix.longestCommonPrefix(words);
        assertEquals(expectedOutput, prefix);
    }
}
