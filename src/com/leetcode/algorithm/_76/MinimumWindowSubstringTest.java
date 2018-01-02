package com.leetcode.algorithm._76;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinimumWindowSubstringTest {
    @Test
    public void minWindow() throws Exception {

        String[][] inputs = {
                {"ADOBECODEBANC", "ABC"},
                {"ADOBECODEBANC", "X"},
                {"bdab", "ab"},
        };

        String[] results = {
                "BANC",
                "",
                "ab",
        };

        for (int i = 0; i < results.length; i++) {
            assertEquals(results[i], new MinimumWindowSubstring().minWindow(inputs[i][0], inputs[i][1]));
        }
    }

}