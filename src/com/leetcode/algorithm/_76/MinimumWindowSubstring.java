package com.leetcode.algorithm._76;

import java.util.HashMap;

/**
 * @see https://leetcode.com/problems/minimum-window-substring/description/
 * Tag: Array
 * Tag: Two Pointer
 */
public class MinimumWindowSubstring {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> tMap = new HashMap<>();

        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (tMap.containsKey(c)) {
                tMap.put(c, tMap.get(c) + 1);
            } else {
                tMap.put(c, 1);
            }
        }

        String min = "";
        int minLen = s.length() + 1;

        int matchSize = 0;

        int start = 0;
        for (int end = 0; end < s.length(); end++) {
            char c = s.charAt(end);

            if (tMap.containsKey(c)) {
                tMap.put(c, tMap.get(c) - 1);

                if (tMap.get(c) == 0) {
                    matchSize++;

                    if (matchSize == tMap.size()) {

                        for (int i = start; i <= end; i++) {
                            c = s.charAt(i);

                            if (tMap.containsKey(c)) {
                                int num = tMap.get(c) + 1;
                                tMap.put(c, num);

                                if (num > 0) {
                                    int len = end - i + 1;
                                    if (minLen > len) {
                                        minLen = len;
                                        min = s.substring(i, end+1);
                                    }

                                    start = i + 1;
                                    matchSize--;
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }

        return min;
    }
}
