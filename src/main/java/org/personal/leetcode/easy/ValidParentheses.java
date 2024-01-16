package org.personal.leetcode.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {

    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();
        Map<Character, Character> characters = new HashMap<>();
        characters.put(')', '(');
        characters.put(']', '[');
        characters.put('}', '{');

        for (char c : s.toCharArray()) {

            if (c == ')' || c == ']' || c == '}') {

                if (stack.empty()) {
                    return false;
                }
                char topOfStack = stack.peek();
                if (characters.get(c) == topOfStack) {
                    stack.pop();
                } else {
                    return false;
                }

            } else {
                stack.push(c);
            }
        }

        return stack.empty();
    }
}
