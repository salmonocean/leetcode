package com.leetcode.algorithm;

import com.leetcode.data.TreeNode;

/**
 * @see https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/description/
 * No.: 106
 * Tag: Binary Tree
 * Tag: Recursion
 */
public class ConstructBinaryTreeFromInorderAndPostorderTraversal {
    public static void main(String[] args) {
    }

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return buildTreeInPost(inorder, postorder, 0, inorder.length-1, 0, postorder.length-1);
    }

    private TreeNode buildTreeInPost(int[] inorder, int[] postorder, int inLeft, int inRight,
                                    int postLeft, int postRight) {
        int i;

        if (postLeft > postRight || inLeft > inRight)
            return null;

        for (i = inLeft; i <= inRight; i++) {
            if (inorder[i] == postorder[postRight])
                break;
        }

        TreeNode node = new TreeNode(postorder[postRight]);

        TreeNode left = buildTreeInPost(inorder, postorder, inLeft, i-1,
                postLeft, postLeft + i-inLeft-1);
        TreeNode right = buildTreeInPost(inorder, postorder, i+1, inRight,
                postLeft+i-inLeft, postRight-1);
        node.left = left;
        node.right = right;

        return node;
    }
}
