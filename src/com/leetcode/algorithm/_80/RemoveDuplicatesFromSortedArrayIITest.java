package com.leetcode.algorithm._80;

import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveDuplicatesFromSortedArrayIITest {
    @Test
    public void removeDuplicates() throws Exception {
        int[][] inputs = {
                {1},
                {1, 1, 1, 2, 2, 3},
                {1, 2, 3, 3, 3}
        };

        int[][] results = {
                {1},
                {1, 1, 2, 2, 3},
                {1, 2, 3, 3}
        };

        for (int i = 0; i < results.length; i++) {
            assertTrue(equal(results[i], inputs[i], new RemoveDuplicatesFromSortedArrayII().removeDuplicates(inputs[i])));
        }
    }

    private boolean equal(int[] result, int[] input, int size) {
        if (result.length != size || input.length < size) {
            return false;
        }

        for (int i = 0; i < size; i++) {
            if (result[i] != input[i]) {
                return false;
            }
        }

        return true;
    }

}