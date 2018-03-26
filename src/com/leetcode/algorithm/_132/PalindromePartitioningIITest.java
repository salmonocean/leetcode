package com.leetcode.algorithm._132;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromePartitioningIITest {
    @Test
    public void minCut() throws Exception {
        String[] inputs = {
                "aab",
                "a",
                "baab"
        };

        int[] results = {
                1,
                0,
                0
        };

        for (int i = 0; i < inputs.length; i++) {
            assertEquals(results[i], new PalindromePartitioningII().minCut(inputs[i]));
        }
    }

}
