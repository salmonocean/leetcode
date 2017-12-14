package com.leetcode.algorithm._96;

/**
 * @see https://leetcode.com/problems/unique-binary-search-trees/description/
 * Tag: Binary Tree
 * Tag: DP
 */
public class UniqueBinarySearchTrees {
    public int numTrees(int n) {
        int sum[] = new int[n+1];
        int i, j;

        sum[0] = 1;

        for (i=1; i <= n; i++) {
            for (j=1; j <= i; j++) {
                sum[i] += sum[j-1] * sum[i-j];
            }
        }

        return sum[n];
    }
}
