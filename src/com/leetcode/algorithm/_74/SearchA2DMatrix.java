package com.leetcode.algorithm._74;

/**
 * @see https://leetcode.com/problems/search-a-2d-matrix/description/
 * Tag: Array
 * Tag: Binary Search
 */
public class SearchA2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0)
            return false;

        int m, n, mid, left, right;
        m = matrix.length;
        n = matrix[0].length;
        left = 0;
        right = m * n - 1;
        int value;

        while (left <= right) {
            mid = left + (right - left) / 2;
            value = matrix[mid/n][mid%n];
            if (value < target) {
                left = mid + 1;
            } else if (value > target) {
                right = mid - 1;
            } else {
                return true;
            }
        }

        return false;
    }
}
