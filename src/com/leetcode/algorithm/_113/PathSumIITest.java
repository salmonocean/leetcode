package com.leetcode.algorithm._113;

import com.leetcode.data.TreeNode;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class PathSumIITest {
    @Test
    public void pathSum() throws Exception {
        TreeNode node1 = new TreeNode(5);
        TreeNode node2 = new TreeNode(4);
        TreeNode node3 = new TreeNode(8);
        TreeNode node4 = new TreeNode(11);
        TreeNode node5 = new TreeNode(13);
        TreeNode node6 = new TreeNode(4);
        TreeNode node7 = new TreeNode(7);
        TreeNode node8 = new TreeNode(2);
        TreeNode node9 = new TreeNode(5);
        TreeNode node10 = new TreeNode(1);

        node1.left = node2;
        node1.right = node3;

        node2.left = node4;

        node3.left = node5;
        node3.right = node6;

        node4.left = node7;
        node4.right = node8;

        node6.left = node9;
        node6.right = node10;

        ArrayList<ArrayList<ArrayList<Integer>>> results = new ArrayList<ArrayList<ArrayList<Integer>>>() {{
           add(new ArrayList<ArrayList<Integer>>() {{
               add(new ArrayList<Integer>() {{
                   add(5);
                   add(4);
                   add(11);
                   add(2);
               }});
               add(new ArrayList<Integer>() {{
                   add(5);
                   add(8);
                   add(4);
                   add(5);
               }});
           }});
        }};

        int[] inputs = {22};

        for (int i = 0; i < results.size(); i++) {
            ArrayList<ArrayList<Integer>> r = new PathSumII().pathSum(node1, inputs[i]);

            assertTrue(results.get(i).containsAll(r) && results.get(i).size() == r.size());
        }
    }

}