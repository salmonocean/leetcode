package com.leetcode.algorithm._99;

import com.leetcode.data.TreeNode;

import java.util.Stack;

/**
 * @see https://leetcode.com/problems/recover-binary-search-tree/description/
 * Tag: Binary Tree
 * Tag: In Order
 */
public class RecoverBinarySearchTree {
    public void recoverTree(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();

        TreeNode node = root;
        TreeNode prev, first, second;
        prev = first = second = null;

        while (!stack.isEmpty() || node != null) {
            if (node != null) {
                stack.push(node);
                node = node.left;
            } else {
                node = stack.pop();
                if (prev != null && prev.val > node.val) {
                    if (first == null) {
                        first = prev;
                        second = node;
                    } else {
                        second = node;
                        break;
                    }
                }

                prev = node;
                node = node.right;
            }
        }

        int tmp = second.val;
        second.val = first.val;
        first.val = tmp;
    }
}
