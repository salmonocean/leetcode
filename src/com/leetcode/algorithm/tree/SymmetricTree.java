package com.leetcode.algorithm.tree;

import com.leetcode.data.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @see https://leetcode.com/problems/symmetric-tree/description/
 * No.: 101
 * Tag: Binary Tree
 * Tag: Level Order
 */
public class SymmetricTree {
    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(2);
        TreeNode node4 = new TreeNode(3);
        TreeNode node5 = new TreeNode(4);
        TreeNode node6 = new TreeNode(4);
        TreeNode node7 = new TreeNode(3);

        node1.left = node2;
        node1.right = node3;

        node2.left = node4;
        node2.right = node5;

        node3.left = node6;
        node3.right = node7;

        System.out.println(new SymmetricTree().isSymmetric(node1));

        node2.left = null;
        node2.right = node4;

        node3.left = null;
        node3.right = node7;

        System.out.println(new SymmetricTree().isSymmetric(node1));
    }

    public boolean isSymmetric(TreeNode root) {
        TreeNode node1, node2;
        if (root == null)
            return true;

        Queue<TreeNode> que1, que2;
        que1 = new LinkedList<>();
        que1.add(root.left);
        que2 = new LinkedList<>();
        que2.add(root.right);

        while (!que1.isEmpty() && !que2.isEmpty()) {
            node1 = que1.poll();
            node2 = que2.poll();

            if (node1 == null && node2 == null) {
                continue;
            } else if (node1 == null || node2 == null || node1.val != node2.val) {
                return false;
            } else {
                que1.add(node1.left);
                que1.add(node1.right);

                que2.add(node2.right);
                que2.add(node2.left);

            }
        }

        return que1.isEmpty() && que2.isEmpty();
    }
}
