package com.leetcode.algorithm;

import com.leetcode.data.TreeNode;

import java.util.ArrayList;

/**
 * @see https://leetcode.com/problems/path-sum-ii/description/
 * No.: 113
 * Tag: Binary Tree
 * Tag: Recursion
 * Tag: Post Order
 */
public class PathSum_II {
    public static void main(String[] args) {
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

        System.out.println(new PathSum_II().pathSum(node1, 22));
    }

    public ArrayList<ArrayList<Integer>> pathSum(TreeNode root, int sum) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        ArrayList<Integer> res = new ArrayList<>();

        if (root != null) {
            dfs(root, sum, list, res);
        }

        return list;
    }

    public void dfs(TreeNode root, int sum, ArrayList<ArrayList<Integer>> list,
                    ArrayList<Integer> res) {
        res.add(root.val);

        if (root.left == null && root.right == null) {
            if (root.val == sum) {
                list.add(new ArrayList<>(res));
            }
        }

        if (root.left != null) {
            dfs(root.left, sum-root.val, list, res);
        }
        if (root.right != null) {
            dfs(root.right, sum-root.val, list, res);
        }

        res.remove(res.size()-1);
    }
}
