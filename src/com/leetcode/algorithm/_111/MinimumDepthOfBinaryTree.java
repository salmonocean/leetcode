package com.leetcode.algorithm._111;

import com.leetcode.data.TreeNode;

/**
 * @see https://leetcode.com/problems/minimum-depth-of-binary-tree/description/
 * Tag: Binary Tree
 * Tag: Level Order
 * Tag: Recursion
 */
public class MinimumDepthOfBinaryTree {

    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftDepth = minDepth(root.left);
        int rightDepth = minDepth(root.right);

        if (leftDepth == 0 || rightDepth == 0) {
            return leftDepth + rightDepth + 1;
        } else {
            return Math.min(leftDepth, rightDepth) + 1;
        }
    }
}