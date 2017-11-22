package com.leetcode.algorithm._131;

import java.util.ArrayList;
import java.util.List;

/**
 * @see https://leetcode.com/problems/palindrome-partitioning/description/
 * Tag: DFS
 */
public class PalindromePartitioning {
    public List<List<String>> partition(String s) {
        return dfs(s);
    }

    private List<List<String>> dfs(String s) {
        List<List<String>> results = new ArrayList<>();

        if (s.equals("")) {
            List<String> r = new ArrayList<>();
            results.add(r);

            return results;
        }

        if (s.length() == 1) {
            List<String> r = new ArrayList<>();
            r.add(s);

            results.add(r);

            return results;
        }

        for (int i = 0; i < s.length(); i++) {
            String right = s.substring(i);
            if (isPalindrome(right)) {
                List<List<String>> pre = dfs(s.substring(0, i));

                for (List<String> p : pre) {
                    p.add(right);
                }

                results.addAll(pre);
            }
        }

        return results;
    }

    private boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}
