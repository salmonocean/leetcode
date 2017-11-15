package com.leetcode.algorithm;

import com.leetcode.data.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @see https://leetcode.com/problems/binary-tree-level-order-traversal-ii/description/
 * No.: 107
 * Tag: Binary Tree
 * Tag: Level Order
 */
public class BinaryTreeLevelOrderTraversal_II {
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

        System.out.println(new BinaryTreeLevelOrderTraversal_II().levelOrderBottom(node1));
    }

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        LinkedList<List<Integer>> levels = new LinkedList<>();

        if (root == null)
            return levels;

        int size;
        TreeNode node;
        queue.offer(root);

        while (!queue.isEmpty()) {
            LinkedList<Integer> list = new LinkedList<>();
            size = queue.size();

            while (size > 0) {
                node = queue.poll();
                list.add(node.val);

                if (node.left != null) {
                    queue.offer(node.left);
                }

                if (node.right != null) {
                    queue.offer(node.right);
                }

                size--;
            }

            levels.addFirst(list);
        }

        return levels;
    }
}