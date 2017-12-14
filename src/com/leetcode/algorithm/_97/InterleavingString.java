package com.leetcode.algorithm._97;

/**
 * @see https://leetcode.com/problems/interleaving-string/description/
 * Tag: DP
 */
public class InterleavingString {
    public boolean isInterleave(String s1, String s2, String s3) {
        if (s3.length() != s1.length() + s2.length()) {
            return false;
        }

        boolean[] results = new boolean[s2.length() + 1];

        for (int i = 0; i < s1.length() + 1; i++) {
            for (int j = 0; j < s2.length() + 1; j++) {
                results[j] = (i == 0 && j == 0) ||
                        (j > 0 && s2.charAt(j-1) == s3.charAt(i+j-1) && results[j-1]) ||
                        (i > 0 && s1.charAt(i-1) == s3.charAt(i+j-1) && results[j]);
            }
        }

        return results[s2.length()];
    }
}
