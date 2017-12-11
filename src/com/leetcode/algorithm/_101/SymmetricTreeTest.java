package com.leetcode.algorithm._101;

import com.leetcode.data.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class SymmetricTreeTest {
    @Test
    public void isSymmetric() throws Exception {
        TreeNode n01 = new TreeNode(1);
        TreeNode n02 = new TreeNode(2);
        TreeNode n03 = new TreeNode(2);
        TreeNode n04 = new TreeNode(3);
        TreeNode n05 = new TreeNode(4);
        TreeNode n06 = new TreeNode(4);
        TreeNode n07 = new TreeNode(3);

        n01.left = n02;
        n01.right = n03;

        n02.left = n04;
        n02.right = n05;

        n03.left = n06;
        n03.right = n07;

        TreeNode n11 = new TreeNode(1);
        TreeNode n12 = new TreeNode(2);
        TreeNode n13 = new TreeNode(2);
        TreeNode n14 = new TreeNode(3);
        TreeNode n15 = new TreeNode(3);

        n11.left = n12;
        n11.right = n13;

        n12.right = n14;
        n13.right = n15;


        TreeNode[] inputs = {n01, n11};

        boolean[] results = {true, false};

        for (int i = 0; i < results.length; i++) {
            assertEquals(results[i], new SymmetricTree().isSymmetric(inputs[i]));
        }
    }
}