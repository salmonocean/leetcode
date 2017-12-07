package com.leetcode.algorithm._145;

import com.leetcode.data.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @see https://leetcode.com/problems/binary-tree-postorder-traversal/description/
 * Tag: Binary Tree
 * Tag: Stack
 * Tag: DFS
 */
public class BinaryTreePostorderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        TreeNode prevNode = null;

        while (!stack.empty() || node != null) {
            if (node != null) {
                stack.push(node);
                node = node.left;
            } else {
                node = stack.peek();

                if (node.right != null && node.right != prevNode) {
                    node = node.right;
                } else {
                    list.add(node.val);
                    stack.pop();
                    prevNode = node;
                    node = null;
                }
            }
        }

        return list;
    }
}
