package com.leetcode.algorithm.BalancedBinaryTree;

import com.leetcode.data.TreeNode;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class BalancedBinaryTreeTest {
    @Test
    public void isBalanced() throws Exception {
        ArrayList<TreeNode> inputs = new ArrayList<>();
        TreeNode n00 = new TreeNode(0);
        TreeNode n01 = new TreeNode(1);
        TreeNode n02 = new TreeNode(2);
        TreeNode n03 = new TreeNode(3);

        n00.left = n01;
        n00.right = n02;
        n02.right = n03;

        TreeNode n10 = new TreeNode(0);
        TreeNode n11 = new TreeNode(1);
        TreeNode n12 = new TreeNode(2);

        n10.left = n11;
        n11.left = n12;

        TreeNode n20 = new TreeNode(0);
        TreeNode n21 = new TreeNode(1);
        TreeNode n22 = new TreeNode(2);
        TreeNode n23 = new TreeNode(3);
        TreeNode n24 = new TreeNode(4);
        TreeNode n25 = new TreeNode(5);

        n20.left = n21;
        n20.right = n22;
        n21.left = n23;
        n22.right = n24;
        n24.right = n25;

        inputs.add(n00);
        inputs.add(n10);
        inputs.add(n20);


        boolean[] results = {true, false, false};

        for (int i = 0; i < inputs.size(); i++) {
            BalancedBinaryTree b = new BalancedBinaryTree();
            assertEquals(results[i], b.isBalanced(inputs.get(i)));
        }
    }

}