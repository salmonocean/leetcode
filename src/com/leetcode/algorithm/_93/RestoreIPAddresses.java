package com.leetcode.algorithm._93;

import java.util.ArrayList;
import java.util.List;

/**
 * @see https://leetcode.com/problems/restore-ip-addresses/description/
 * Tag: DFS
 */
public class RestoreIPAddresses {

    public List<String> restoreIpAddresses(String s) {
        return dfs(s, 0, 4);
    }

    private List<String> dfs(String s, int strIndex, int dotNum) {
        List<String> list = new ArrayList<>();
        int i, val;
        List<String> tmp;

        if (dotNum == 0) {
            if (strIndex == s.length())
                list.add("");

            return list;
        }

        for (i = 0; i < 3 && (i+strIndex < s.length()); i++) {
            val = Integer.valueOf(s.substring(strIndex, i+strIndex+1));
            if (val < 256) {
                tmp = dfs(s, strIndex+i+1, dotNum-1);

                for (String str : tmp) {
                    StringBuffer sb = new StringBuffer();
                    sb.append(s.substring(strIndex, i+strIndex+1));
                    if (!str.equals(""))
                        sb.append(".");
                    sb.append(str);
                    list.add(sb.toString());
                }
            }

            if (val == 0)
                break;
        }

        return list;
    }
}
