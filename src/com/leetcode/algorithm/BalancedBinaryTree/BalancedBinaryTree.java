package com.leetcode.algorithm.BalancedBinaryTree;

import com.leetcode.data.TreeNode;

/**
 * @see https://leetcode.com/problems/balanced-binary-tree/description/
 * No.: 110
 * Tag: Binary Tree
 * Tag: Balanced Binary Tree
 * Tag: Recursion
 */
public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        return isBalancedHelper(root) != -1;
    }

    private int isBalancedHelper(TreeNode root) {
        if (root == null)
            return 0;

        int l = isBalancedHelper(root.left);
        int r = isBalancedHelper(root.right);

        int d = l - r;
        if (l == -1 || r == -1 ||
                d < -1 || d > 1)
            return -1;
        else
            return d > 0 ? l + 1 : r + 1;
    }
}
