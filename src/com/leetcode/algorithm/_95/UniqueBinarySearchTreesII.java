package com.leetcode.algorithm._95;

import com.leetcode.data.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @see https://leetcode.com/problems/unique-binary-search-trees-ii/description/
 * Tag: Binary Tree
 * Tag: Recursion
 */
public class UniqueBinarySearchTreesII {

    public List<TreeNode> generateTrees(int n) {
        return dfs(1, n);
    }

    private List<TreeNode> dfs(int l, int r) {
        List<TreeNode> list = new ArrayList<>();
        if (l > r) {
            list.add(null);
            return list;
        }

        for (int i = l; i <= r; i++) {
            List<TreeNode> leftList = dfs(l, i-1);
            List<TreeNode> rightList = dfs(i+1, r);

            TreeNode node;
            for (TreeNode leftNode : leftList) {
                for (TreeNode rightNode : rightList) {
                    node = new TreeNode(i);
                    node.left = leftNode;
                    node.right = rightNode;

                    list.add(node);
                }
            }
        }

        return list;
    }
}
