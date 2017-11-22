package com.leetcode.algorithm._132;

/**
 * @see https://leetcode.com/problems/palindrome-partitioning-ii/description/
 * Tag: DP
 * Tag: DFS
 * Tag: 最短路径
 */
public class PalindromePartitioningII {
    public int minCut(String s) {
        int len = s.length();
        boolean[][] allp = new boolean[len][len];

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len - i; j++) {
                allp[j][i+j] = (s.charAt(j) == s.charAt(i+j)) &&
                        (i < 2 || allp[j+1][i+j-1]);
            }
        }

        return dp(allp, s);
//        return dfs(allp, s, 0, s.length() - 1);
    }

    private int dp(boolean[][] allp, String s) {
        int len = s.length();
        int[] cut = new int[len];

        for (int i = 0; i < len; i++) {
            cut[i] = i;
            for (int j = 0; j <= i; j++) {
                if (allp[j][i]) {
                    if (j == 0) {
                        cut[i] = 0;
                        break;
                    }
                    cut[i] = Math.min(cut[i], cut[j-1] + 1);
                }
            }
        }

        return cut[len-1];
    }

    private int dfs(boolean[][] allp, String s, int start, int end) {
        int min = end - start;

        for (int i = start; i <= end; i++) {
            if (allp[start][i]) {
                min = Math.min(min, dfs(allp, s, i+1, end) + 1);
            }
        }

        return min;
    }
}
