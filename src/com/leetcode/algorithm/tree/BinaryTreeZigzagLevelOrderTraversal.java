package com.leetcode.algorithm.tree;

import com.leetcode.data.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @see https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/description/
 * No.: 103
 * Tag: Binary Tree
 * Tag: Level Order
 */
public class BinaryTreeZigzagLevelOrderTraversal {
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

        System.out.println(new BinaryTreeZigzagLevelOrderTraversal().zigzagLevelOrder(node1));
    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        LinkedList<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> levels = new ArrayList<>();

        if (root == null)
            return levels;

        int size;
        TreeNode node;
        queue.offer(root);

        boolean ltr = true;

        while (!queue.isEmpty()) {
            ArrayList<Integer> list = new ArrayList<>();
            size = queue.size();

            while (size > 0) {
                node = ltr ? queue.poll() : queue.pollLast();
                list.add(node.val);

                if (ltr) {
                    if (node.left != null) {
                        queue.offer(node.left);
                    }

                    if (node.right != null) {
                        queue.offer(node.right);
                    }
                } else {
                    if (node.right != null) {
                        queue.offerFirst(node.right);
                    }

                    if (node.left != null) {
                        queue.offerFirst(node.left);
                    }
                }

                size--;
            }

            levels.add(list);

            ltr = !ltr;
        }

        return levels;
    }
}
