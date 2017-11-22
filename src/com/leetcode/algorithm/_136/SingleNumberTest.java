package com.leetcode.algorithm._136;

import org.junit.Test;

import static org.junit.Assert.*;

public class SingleNumberTest {
    @Test
    public void singleNumber() throws Exception {
        int[][] inputs = {
                {1, 3, 5, 5, 3}
        };

        int[] results = {1};

        for (int i = 0; i < results.length; i++) {
            assertEquals(results[i], new SingleNumber().singleNumber(inputs[i]));
        }
    }

}