package com.leetcode.algorithm._105;

import com.leetcode.data.TreeNode;

/**
 * @see https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/description/
 * Tag: Binary Tree
 * Tag: Recursion
 */
public class ConstructBinaryTreeFromPreorderAndInorderTraversal {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTreePreIn(preorder, inorder, 0, preorder.length-1, 0, inorder.length-1);
    }

    private TreeNode buildTreePreIn(int[] preorder, int[] inorder, int preLeft, int preRight,
                                   int inLeft, int inRight) {
        int i;

        if (preLeft > preRight || inLeft > inRight)
            return null;

        for (i = inLeft; i <= inRight; i++) {
            if (inorder[i] == preorder[preLeft])
                break;
        }

        TreeNode node = new TreeNode(preorder[preLeft]);

        TreeNode left = buildTreePreIn(preorder, inorder, preLeft+1, preLeft+i-inLeft,
                inLeft, i-1);
        TreeNode right = buildTreePreIn(preorder, inorder, preLeft+i-inLeft+1, preRight,
                i+1, inRight);
        node.left = left;
        node.right = right;

        return node;
    }
}
