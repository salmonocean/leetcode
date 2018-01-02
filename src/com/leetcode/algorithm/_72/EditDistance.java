package com.leetcode.algorithm._72;

/**
 * @see https://leetcode.com/problems/edit-distance/description/
 * Tag: DP
 */
public class EditDistance {

    public int minDistance(String word1, String word2) {
        int[] dis = new int[word2.length() + 1];

        int prev, min;
        for (int j = 0; j <= word2.length(); j++) {
            dis[j] = j;
        }

        for (int i = 1; i <= word1.length(); i++) {
            prev = dis[0];
            dis[0] = i;

            for (int j = 1; j <= word2.length(); j++) {

                min = Math.min(dis[j-1] + 1, dis[j] + 1);
                min = Math.min(min, word1.charAt(i - 1) == word2.charAt(j - 1) ? prev : prev + 1);

                prev = dis[j];
                dis[j] = min;
            }
        }

        return dis[word2.length()];
    }
}
