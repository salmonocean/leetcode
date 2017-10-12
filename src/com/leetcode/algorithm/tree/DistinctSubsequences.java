package com.leetcode.algorithm.tree;

/**
 * @see https://leetcode.com/problems/distinct-subsequences/description/
 * No.: 115
 * Tag: Dynamic Programming
 */
public class DistinctSubsequences {
    public static void main(String[] args) {
        System.out.println(new DistinctSubsequences().numDistinct("rabbbit", "rabbit"));
    }

    public int numDistinct(String s, String t) {
        int[][] nums = new int[s.length()+1][t.length()+1];

        for (int i = 0; i < t.length() + 1; i++) {
            for (int j = i; j < s.length() + 1; j++) {
                if (i == 0) {
                    nums[j][i] = 1;
                } else {
                    if (t.charAt(t.length() -i) == s.charAt(s.length()-j)) {
                        nums[j][i] = nums[j-1][i-1] + nums[j-1][i];
                    } else {
                        nums[j][i] = nums[j-1][i];
                    }
                }
            }
        }

        return nums[s.length()][t.length()];
    }
}
