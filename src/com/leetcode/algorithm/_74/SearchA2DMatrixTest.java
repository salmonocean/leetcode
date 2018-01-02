package com.leetcode.algorithm._74;

import org.junit.Test;

import static org.junit.Assert.*;

public class SearchA2DMatrixTest {
    @Test
    public void searchMatrix() throws Exception {
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 50}
        };

        int[] inputs = {
                3,
                1,
                50,
                0,
                100
        };

        boolean[] results = {
                true,
                true,
                true,
                false,
                false
        };

        for (int i = 0; i < results.length; i++) {
            assertEquals(results[i], new SearchA2DMatrix().searchMatrix(matrix, inputs[i]));
        }
    }

}