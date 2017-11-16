package com.leetcode.algorithm.MaximumDepthOfBinaryTree;

import com.leetcode.data.TreeNode;

/**
 * @see https://leetcode.com/problems/maximum-depth-of-binary-tree/description/
 * No.: 104
 * Tag: Binary Tree
 * Tag: Level Order
 * Tag: Recursion
 */
public class MaximumDepthOfBinaryTree {

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
