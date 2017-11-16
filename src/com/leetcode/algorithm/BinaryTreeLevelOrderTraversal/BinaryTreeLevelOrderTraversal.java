package com.leetcode.algorithm.BinaryTreeLevelOrderTraversal;

import com.leetcode.data.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @see https://leetcode.com/problems/binary-tree-level-order-traversal/description/
 * No.: 102
 * Tag: Binary Tree
 * Tag: Level Order
 */
public class BinaryTreeLevelOrderTraversal {

    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> levels = new ArrayList<>();

        if (root == null)
            return levels;

        int size;
        TreeNode node;
        queue.offer(root);

        while (!queue.isEmpty()) {
            ArrayList<Integer> list = new ArrayList<>();
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

            levels.add(list);
        }

        return levels;
    }
}