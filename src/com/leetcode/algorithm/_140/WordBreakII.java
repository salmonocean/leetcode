package com.leetcode.algorithm._140;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @see https://leetcode.com/problems/word-break-ii/description/
 * Tag: DFS
 */
public class WordBreakII {

    public List<String> wordBreak(String s, List<String> wordDict) {
        HashMap<String, List<String>> map = new HashMap<>();

        return dfs(s, wordDict, map);
    }

    private List<String> dfs(String s, List<String> wordDict, HashMap<String, List<String>> map) {
        if (map.containsKey(s)) {
            return map.get(s);
        }

        List<String> result = new ArrayList<>();

        for (String w : wordDict) {
            if (s.equals(w)) {
                result.add(w);
            } else if (s.startsWith(w)) {
                List<String> childList = dfs(s.substring(w.length()), wordDict, map);

                for (String c : childList) {
                    result.add(w + " " + c);
                }
            }
        }

        map.put(s, result);

        return result;
    }
}
