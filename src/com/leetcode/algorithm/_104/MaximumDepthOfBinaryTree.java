package com.leetcode.algorithm._104;

import com.leetcode.data.TreeNode;

/**
 * @see https://leetcode.com/problems/maximum-depth-of-binary-tree/description/
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
