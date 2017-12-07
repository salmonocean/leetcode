package com.leetcode.algorithm._150;

import java.util.Stack;

/**
 * @see https://leetcode.com/problems/evaluate-reverse-polish-notation/description/
 * Tag: Stack
 */
public class EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {
        Stack<Integer> numbers = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            int num, n1, n2;
            try {
                num = Integer.valueOf(tokens[i]);

            } catch (Exception e) {
                n2 = numbers.pop();
                n1 = numbers.pop();

                if (tokens[i].equals("+")) {
                    num = n1 + n2;
                } else if (tokens[i].equals("-")) {
                    num = n1 - n2;
                } else if (tokens[i].equals("*")) {
                    num = n1 * n2;
                } else if (tokens[i].equals("/")) {
                    num = n1 / n2;
                } else {
                    return -1;
                }
            }
            numbers.push(num);
        }

        return numbers.pop();
    }
}
