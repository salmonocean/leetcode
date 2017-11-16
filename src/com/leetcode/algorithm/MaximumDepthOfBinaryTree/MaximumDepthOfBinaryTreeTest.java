package com.leetcode.algorithm.MaximumDepthOfBinaryTree;

import com.leetcode.data.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaximumDepthOfBinaryTreeTest {
    @Test
    public void maxDepth() throws Exception {
        TreeNode node1 = new TreeNode(3);
        TreeNode node2 = new TreeNode(9);
        TreeNode node3 = new TreeNode(20);
        TreeNode node4 = new TreeNode(15);
        TreeNode node5 = new TreeNode(7);

        node1.left = node2;
        node1.right = node3;

        node2.left = node4;
        node2.right = node5;

        TreeNode[] inputs = {node1};

        int[] results = {3};

        for (int i = 0; i < results.length; i++) {
            assertEquals(results[i], new MaximumDepthOfBinaryTree().maxDepth(inputs[i]));
        }
    }

}