package com.leetcode.algorithm._139;

import java.util.List;

/**
 * @see https://leetcode.com/problems/word-break/description/
 * Tag: DP
 */
public class WordBreak {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] canBreak = new boolean[s.length()+1];
        canBreak[0] = true;

        for (int i = 1; i <= s.length(); i++) {
            for (int j = i-1; j >= 0; j--) {
                if (canBreak[j] && wordDict.contains(s.substring(j, i))) {
                    canBreak[i] = true;
                    break;
                }
            }
        }

        return canBreak[canBreak.length - 1];
    }
}
