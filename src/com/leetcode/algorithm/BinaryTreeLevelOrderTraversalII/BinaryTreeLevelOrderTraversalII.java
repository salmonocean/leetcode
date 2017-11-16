package com.leetcode.algorithm.BinaryTreeLevelOrderTraversalII;

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
public class BinaryTreeLevelOrderTraversalII {
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