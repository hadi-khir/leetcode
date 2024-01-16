package org.personal.leetcode;

import org.junit.jupiter.api.Test;
import org.personal.leetcode.easy.ValidParentheses;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidParenthesesTests {

    @Test
    void testValidParentheses() {

        ValidParentheses validParentheses = new ValidParentheses();

        String s = "()";
        boolean valid = validParentheses.isValid(s);
        assertTrue(valid);

        s = "()[]{}";
        valid = validParentheses.isValid(s);
        assertTrue(valid);

        s = "(]";
        valid = validParentheses.isValid(s);
        assertFalse(valid);

        s = "]";
        valid = validParentheses.isValid(s);
        assertFalse(valid);

        s = "((";
        valid = validParentheses.isValid(s);
        assertFalse(valid);
    }
}
