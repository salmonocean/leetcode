package com.leetcode.algorithm._150;

import org.junit.Test;

import static org.junit.Assert.*;

public class EvaluateReversePolishNotationTest {
    @Test
    public void evalRPN() throws Exception {
        String[][] inputs = {
                {"2", "1", "+", "3", "*"},
                {"4", "13", "5", "/", "+"}
        };

        int[] results = {
                9,
                6
        };

        for (int i = 0; i < results.length; i++) {
            assertEquals(results[i], new EvaluateReversePolishNotation().evalRPN(inputs[i]));
        }
    }

}