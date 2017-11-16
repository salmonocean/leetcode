package com.leetcode.algorithm.FlattenBinaryTreeToLinkedList;

import com.leetcode.data.TreeNode;
import org.junit.Test;

public class FlattenBinaryTreeToLinkedListTest {
    @Test
    public void flatten() throws Exception {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);

        node1.left = node2;
        node1.right = node5;

        node2.left = node3;
        node2.right = node4;

        node5.right = node6;

        TreeNode r1 = new TreeNode(1);
        TreeNode r2 = new TreeNode(2);
        TreeNode r3 = new TreeNode(3);
        TreeNode r4 = new TreeNode(4);
        TreeNode r5 = new TreeNode(5);
        TreeNode r6 = new TreeNode(6);

        r1.right = r2;
        r2.right = r3;
        r3.right = r4;
        r4.right = r5;
        r5.right = r6;

        new FlattenBinaryTreeToLinkedList().flatten(node1);

        TreeNode.equal(r1, node1);

    }

}