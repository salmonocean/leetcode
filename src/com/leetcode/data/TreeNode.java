package com.leetcode.data;

import static org.junit.Assert.assertTrue;

/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int x) { val = x; }

    public static boolean equal(TreeNode node1, TreeNode node2) {
        boolean result = (node1 == null && node2 == null) ||
                (node1 != null && node2 != null &&
                        node1.val == node2.val &&
                        equal(node1.left, node2.left) &&
                        equal(node1.right, node2.right));
        assertTrue(result);

        return result;
    }
}

