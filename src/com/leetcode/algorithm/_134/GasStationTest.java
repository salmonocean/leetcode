package com.leetcode.algorithm._134;

import org.junit.Test;

import static org.junit.Assert.*;

public class GasStationTest {
    @Test
    public void canCompleteCircuit() throws Exception {
        int[][] inputs = {
                {1, 5, 4, 3, 2},
                {3, 5, 1, 1, 1}
        };

        int[] results = {1};

        for (int i = 0; i < results.length; i++) {
            assertEquals(results[i], new GasStation().canCompleteCircuit(inputs[i], inputs[i+1]));
        }
    }

}