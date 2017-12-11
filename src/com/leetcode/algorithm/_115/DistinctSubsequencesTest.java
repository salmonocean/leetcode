package com.leetcode.algorithm._115;

import org.junit.Test;

import static org.junit.Assert.*;

public class DistinctSubsequencesTest {
    @Test
    public void numDistinct() throws Exception {
        String[][] inputs = {
                {"rabbbit", "rabbit"}
        };

        int[] results = {3};

        for (int i = 0; i < results.length; i++) {
            int r = new DistinctSubsequences().numDistinct(inputs[i][0], inputs[i][1]);
            assertEquals(results[i], r);
        }
    }
}