package com.leetcode.algorithm._114;

import com.leetcode.data.TreeNode;

import java.util.Stack;

/**
 * @see https://leetcode.com/problems/flatten-binary-tree-to-linked-list/description/
 * Tag: Binary Tree
 * Tag: Recursion
 */
public class FlattenBinaryTreeToLinkedList {

    public void flatten(TreeNode root) {
//        dfs(root);

        inOrder1(root);
    }

    private TreeNode dfs(TreeNode root) {
        if (root == null) {
            return null;
        }

        TreeNode lr = dfs(root.left);
        TreeNode rr = dfs(root.right);

        if (lr != null) {
            lr.right = root.right;
        }
        if (root.left != null) {
            root.right = root.left;
        }
        root.left = null;

        if (rr != null) {
            return rr;
        } else if (lr != null) {
            return lr;
        } else {
            return root;
        }
    }

    private void inOrder(TreeNode root) {
        Stack<TreeNode> stack = new Stack();
        TreeNode node = root;
        TreeNode tmp, prev;
        prev = null;

        while (!stack.empty() || node != null) {
            if (node != null) {
                stack.push(node);

                if (prev != null) {
                    prev.right = node;
                }

                prev = node;
                tmp = node.left;
                node.left = node.right;
                node = tmp;
            } else {
                node = stack.pop();

                tmp = node.left;
                node.left = null;
                node = tmp;
            }
        }
    }

    private void inOrder1(TreeNode root) {
        if (root == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        TreeNode node, prev;
        prev = null;

        while (!stack.empty()) {
            node = stack.pop();
            if (node.right != null) {
                stack.push(node.right);
            }

            if (node.left != null) {
                stack.push(node.left);
            }

            if (prev != null) {
                prev.left = null;
                prev.right = node;
            }

            prev = node;
        }
    }
}