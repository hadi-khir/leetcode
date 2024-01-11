package org.personal.leetcode.easy;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {

        String commonPrefix = strs[0];
        for (String str : strs) {

            if (!commonPrefix.equals(str)) {

                StringBuilder tempPrefix = new StringBuilder();
                for (int i = 0; i < commonPrefix.length(); i++) {
                    if (i < str.length() && str.charAt(i) == commonPrefix.charAt(i)) {
                        tempPrefix.append(str.charAt(i));
                    } else {
                        break;
                    }
                }
                commonPrefix = tempPrefix.toString();
            }
        }

        return commonPrefix;
    }
}
