package com.leetcode.algorithm.BinaryTreeLevelOrderTraversal;

import com.leetcode.data.TreeNode;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class BinaryTreeLevelOrderTraversalTest {
    @Test
    public void levelOrder() throws Exception {
        TreeNode node1 = new TreeNode(3);
        TreeNode node2 = new TreeNode(9);
        TreeNode node3 = new TreeNode(20);
        TreeNode node4 = new TreeNode(15);
        TreeNode node5 = new TreeNode(7);

        node1.left = node2;
        node1.right = node3;

        node2.left = node4;
        node2.right = node5;

        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>() {{
            add(new ArrayList<Integer>() {{
                add(3);
            }});
            add(new ArrayList<Integer>() {{
                add(9);
                add(20);
            }});
            add(new ArrayList<Integer>() {{
                add(15);
                add(7);
            }});
        }};


        List<List<Integer>> r = new BinaryTreeLevelOrderTraversal().levelOrder(node1);
        assertTrue(result.containsAll(r) && result.size() == r.size());
    }

}