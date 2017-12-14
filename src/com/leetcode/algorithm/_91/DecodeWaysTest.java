package com.leetcode.algorithm._91;

import org.junit.Test;

import static org.junit.Assert.*;

public class DecodeWaysTest {
    @Test
    public void numDecodings() throws Exception {
        String[] inputs = {
                "12",
                "23",
                "27",
                "0",
                "07",
                "30",
                "10",
                "20"
        };

        int[] results = {
                2,
                2,
                1,
                0,
                0,
                0,
                1,
                1
        };

        for (int i = 0; i < results.length; i++) {
            assertEquals(results[i], new DecodeWays().numDecodings(inputs[i]));
        }
    }

}