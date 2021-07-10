package com.leetcode.algorithm._112;

import com.leetcode.data.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class PathSumTest {
    @Test
    public void hasPathSum() throws Exception {
        TreeNode node1 = new TreeNode(5);
        TreeNode node2 = new TreeNode(4);
        TreeNode node3 = new TreeNode(8);
        TreeNode node4 = new TreeNode(11);
        TreeNode node5 = new TreeNode(13);
        TreeNode node6 = new TreeNode(4);
        TreeNode node7 = new TreeNode(7);
        TreeNode node8 = new TreeNode(2);
        TreeNode node9 = new TreeNode(1);

        node1.left = node2;
        node1.right = node3;

        node2.left = node4;

        node3.left = node5;
        node3.right = node6;

        node4.left = node7;
        node4.right = node8;

        node6.right = node9;

        TreeNode[] inputs = {node1, node1};
        int[] inputs1 = {22, 21};
        boolean[] results = {true, false};

        for (int i = 0; i < results.length; i++) {
            assertEquals(results[i], new PathSum().hasPathSum(inputs[i], inputs1[i]));
        }
    }

}