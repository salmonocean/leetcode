package com.leetcode.algorithm.PathSumII;

import com.leetcode.data.TreeNode;

import java.util.ArrayList;

/**
 * @see https://leetcode.com/problems/path-sum-ii/description/
 * No.: 113
 * Tag: Binary Tree
 * Tag: Recursion
 * Tag: Post Order
 */
public class PathSumII {

    public ArrayList<ArrayList<Integer>> pathSum(TreeNode root, int sum) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        ArrayList<Integer> res = new ArrayList<>();

        if (root != null) {
            dfs(root, sum, list, res);
        }

        return list;
    }

    private void dfs(TreeNode root, int sum, ArrayList<ArrayList<Integer>> list,
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
