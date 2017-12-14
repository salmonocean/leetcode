package com.leetcode.algorithm._96;

import org.junit.Test;

import static org.junit.Assert.*;

public class UniqueBinarySearchTreesTest {
    @Test
    public void numTrees() throws Exception {
        int[] inputs = {
                1,
                2,
                3
        };

        int[] results = {
                1,
                2,
                5
        };

        for (int i = 0; i < results.length; i++) {
            assertEquals(results[i], new UniqueBinarySearchTrees().numTrees(inputs[i]));
        }
    }

}