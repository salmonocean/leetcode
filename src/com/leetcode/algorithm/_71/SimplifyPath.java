package com.leetcode.algorithm._71;

import java.util.Stack;

/**
 * @see https://leetcode.com/problems/simplify-path/description/
 * Tag: Stack
 */
public class SimplifyPath {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        int prev, i;
        String s;

        for (i = 1, prev = 0; i <= path.length(); i++) {
            if (i == path.length() || path.charAt(i) == '/') {
                s = path.substring(prev, i);
                if (s.equals("/..")) {
                    if (!stack.empty()) {
                        stack.pop();
                    }
                } else if (!s.equals("/.") && !s.equals("/")) {
                    stack.push(s);
                }
                prev = i;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (String str : stack) {
            sb.append(str);
        }
        return sb.length() == 0? "/" : sb.toString();
    }
}
