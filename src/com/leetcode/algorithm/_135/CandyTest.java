package com.leetcode.algorithm._135;

import org.junit.Test;

import static org.junit.Assert.*;

public class CandyTest {
    @Test
    public void candy() throws Exception {
        int[][] inputs = {
                {1, 2, 3, 4, 5},
                {5, 4, 3, 2, 1},
                {3, 2, 4, 1, 5},
                {1, 5, 5, 4, 2},
                {4, 2, 2, 1, 3}
        };

        int[] results = {15, 15, 8, 9, 8};

        for (int i = 0; i < results.length; i++) {
            assertEquals(results[i], new Candy().candy(inputs[i]));
        }
    }

}