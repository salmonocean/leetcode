package com.leetcode.algorithm._106;

import com.leetcode.data.TreeNode;
import org.junit.Test;

public class ConstructBinaryTreeFromInorderAndPostorderTraversalTest {
    @Test
    public void buildTree() throws Exception {
        int[] inorder = {4, 2, 1, 5, 3, 6};
        int[] postorder = {4, 2, 5, 6, 3, 1};

        TreeNode result = new TreeNode(1);

        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        TreeNode n6 = new TreeNode(6);

        result.left = n2;
        result.right = n3;

        n2.left = n4;

        n3.left = n5;
        n3.right = n6;


        TreeNode r = new ConstructBinaryTreeFromInorderAndPostorderTraversal().buildTree(inorder, postorder);
        TreeNode.equal(result, r);
    }
}