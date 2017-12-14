package com.leetcode.algorithm._100;

import com.leetcode.data.TreeNode;

/**
 * @see https://leetcode.com/problems/same-tree/description/
 * Tag: Binary Tree
 * Tag: Recursion
 */
public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;

        return (p.val == q.val) && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
