package com.leetcode.algorithm;

import com.leetcode.data.TreeNode;

/**
 * @see https://leetcode.com/problems/maximum-depth-of-binary-tree/description/
 * No.: 104
 * Tag: Binary Tree
 * Tag: Level Order
 * Tag: Recursion
 */
public class MaximumDepthOfBinaryTree {
    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(3);
        TreeNode node2 = new TreeNode(9);
        TreeNode node3 = new TreeNode(20);
        TreeNode node4 = new TreeNode(15);
        TreeNode node5 = new TreeNode(7);

        node1.left = node2;
        node1.right = node3;

        node2.left = node4;
        node2.right = node5;

        System.out.println(new MaximumDepthOfBinaryTree().maxDepth(node1));
    }

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
