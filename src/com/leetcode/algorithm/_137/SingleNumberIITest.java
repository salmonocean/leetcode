package com.leetcode.algorithm._137;

import org.junit.Test;

import static org.junit.Assert.*;

public class SingleNumberIITest {
    @Test
    public void singleNumber() throws Exception {
        int[][] inputs = {
                {1, 3, 5, 3, 5, 3, 5}
        };

        int[] results = {1};

        for (int i = 0; i < results.length; i++) {
            assertEquals(results[i], new SingleNumberII().singleNumber(inputs[i]));
        }
    }

}