package com.leetcode.algorithm._98;

import com.leetcode.data.TreeNode;

/**
 * @see https://leetcode.com/problems/validate-binary-search-tree/description/
 * Tag: Binary Tree
 * Tag: DFS
 * Tag: In Order
 */
public class ValidateBinarySearchTree {

    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean isValidBST(TreeNode root, int min, int max) {
        if (root == null)
            return true;

        return (root.val > min && root.val < max) &&
                isValidBST(root.left, min, root.val) &&
                isValidBST(root.right, root.val, max);
    }
}
