package com.leetcode.algorithm._72;

import org.junit.Test;

import static org.junit.Assert.*;

public class EditDistanceTest {
    @Test
    public void minDistance() throws Exception {
        String[][] inputs = {
                {"ddd", "aaa"},
                {"ddd", "ddd"},
                {"da", "ca"},
                {"plasma", "altruism"},
                {"", "a"}
        };

        int[] results = {
                3,
                0,
                1,
                6,
                1
        };

        for (int i = 0; i < results.length; i++) {
            assertEquals(results[i], new EditDistance().minDistance(inputs[i][0], inputs[i][1]));
        }
    }

}