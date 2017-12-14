package com.leetcode.algorithm._99;

import com.leetcode.algorithm._98.ValidateBinarySearchTree;
import com.leetcode.data.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class RecoverBinarySearchTreeTest {
    @Test
    public void recoverTree() throws Exception {
        TreeNode n01 = new TreeNode(1);
        TreeNode n02 = new TreeNode(2);
        TreeNode n03 = new TreeNode(3);
        TreeNode n04 = new TreeNode(4);
        TreeNode n05 = new TreeNode(5);

        n03.left = n01;
        n03.right = n02;

        n01.right = n05;

        n02.left = n04;

        TreeNode n11 = new TreeNode(1);
        TreeNode n12 = new TreeNode(2);
        TreeNode n13 = new TreeNode(3);
        TreeNode n14 = new TreeNode(4);
        TreeNode n15 = new TreeNode(5);

        n13.left = n11;
        n13.right = n14;

        n11.right = n12;

        n14.left = n15;

        TreeNode[] inputs = {
                n03,
                n13
        };

        for (int i = 0; i < inputs.length; i++) {
            new RecoverBinarySearchTree().recoverTree(inputs[i]);
            assertTrue(isBST(inputs[i]));
        }
    }

    private boolean isBST(TreeNode head) {
        return new ValidateBinarySearchTree().isValidBST(head);
    }

}