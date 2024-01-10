package org.personal.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {

    public int romanToInt(String s) {

        Map<Character, Integer> romanIntegerMap = new HashMap<>();
        romanIntegerMap.put('I', 1);
        romanIntegerMap.put('V', 5);
        romanIntegerMap.put('X', 10);
        romanIntegerMap.put('L', 50);
        romanIntegerMap.put('C', 100);
        romanIntegerMap.put('D', 500);
        romanIntegerMap.put('M', 1000);

        // initialize to irrelevant character outside of map instead of null;
        char previousCharacter = 'Z';
        int sum = 0;
        for (int i = s.length() - 1; i >= 0; i--) {

            char currentCharacter = s.charAt(i);
            boolean mustSubtract = (currentCharacter == 'I' && (previousCharacter == 'V' || previousCharacter == 'X'))
                    || (currentCharacter == 'X' && (previousCharacter == 'L' || previousCharacter == 'C'))
                    || (currentCharacter == 'C' && (previousCharacter == 'D' || previousCharacter == 'M'));

            if (mustSubtract) {
                sum -= romanIntegerMap.get(currentCharacter);
            } else {
                sum += romanIntegerMap.get(currentCharacter);
            }

            previousCharacter = currentCharacter;
        }

        return sum;
    }

    public int romanToIntOptimized(String s) {

        Map<Character, Integer> romanIntegerMap = new HashMap<>();
        romanIntegerMap.put('I', 1);
        romanIntegerMap.put('V', 5);
        romanIntegerMap.put('X', 10);
        romanIntegerMap.put('L', 50);
        romanIntegerMap.put('C', 100);
        romanIntegerMap.put('D', 500);
        romanIntegerMap.put('M', 1000);

        int sum = 0;
        for (int i = s.length() - 1; i >= 0; i--) {

            char currentCharacter = s.charAt(i);

            if (i < s.length() - 1 && romanIntegerMap.get(currentCharacter) < romanIntegerMap.get(s.charAt(i + 1))) {
                sum -= romanIntegerMap.get(currentCharacter);
            } else {
                sum += romanIntegerMap.get(currentCharacter);
            }
        }

        return sum;
    }
}
