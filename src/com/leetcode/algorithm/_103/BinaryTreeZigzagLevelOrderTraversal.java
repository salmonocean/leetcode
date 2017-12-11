package com.leetcode.algorithm._103;

import com.leetcode.data.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @see https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/description/
 * Tag: Binary Tree
 * Tag: Level Order
 */
public class BinaryTreeZigzagLevelOrderTraversal {

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
