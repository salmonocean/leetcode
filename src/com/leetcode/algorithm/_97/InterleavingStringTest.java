package com.leetcode.algorithm._97;

import org.junit.Test;

import static org.junit.Assert.*;

public class InterleavingStringTest {
    @Test
    public void isInterleave() throws Exception {
        String[][] inputs = {
                {"aabcc", "dbbca", "aadbbcbcac"},
                {"aabcc", "dbbca", "aadbbbaccc"}
        };

        boolean[] results = {
                true,
                false
        };

        for (int i = 0; i < results.length; i++) {
            assertEquals(results[i], new InterleavingString().isInterleave(inputs[i][0], inputs[i][1], inputs[i][2]));
        }
    }

}