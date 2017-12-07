package com.leetcode.algorithm._144;

import com.leetcode.data.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @see https://leetcode.com/problems/binary-tree-preorder-traversal/description/
 * Tag: Binary Tree
 * Tag: Stack
 * Tag: DFS
 */
public class BinaryTreePreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;

        while (!stack.empty() || node != null) {
            if (node != null) {
                list.add(node.val);
                stack.push(node);
                node = node.left;
            } else {
                node = stack.pop();
                node = node.right;
            }
        }
        return list;
    }
}
