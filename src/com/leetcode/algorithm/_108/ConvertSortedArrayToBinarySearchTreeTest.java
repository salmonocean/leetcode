package com.leetcode.algorithm._108;

import com.leetcode.data.TreeNode;
import org.junit.Test;

public class ConvertSortedArrayToBinarySearchTreeTest {
    @Test
    public void sortedArrayToBST() throws Exception {
        int[] input = {1, 2, 3, 4, 5, 6};

        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        TreeNode n6 = new TreeNode(6);

        n3.left = n1;
        n3.right = n5;

        n1.right = n2;

        n5.left = n4;
        n5.right = n6;

        TreeNode r = new ConvertSortedArrayToBinarySearchTree().sortedArrayToBST(input);
        TreeNode.equal(n3, r);
    }

}