package com.leetcode.algorithm._112;

import com.leetcode.data.TreeNode;

/**
 * @see https://leetcode.com/problems/path-sum/description/
 * Tag: Binary Tree
 * Tag: Recursion
 * Tag: Post Order
 */
public class PathSum {

    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }

        if (root.left == null && root.right == null) {
            return sum == root.val;
        }

        return hasPathSum(root.left, sum-root.val) ||
                hasPathSum(root.right, sum-root.val);
    }
}
