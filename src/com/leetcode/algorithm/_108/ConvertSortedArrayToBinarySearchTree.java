package com.leetcode.algorithm._108;

import com.leetcode.data.TreeNode;

/**
 * @see https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/description/
 * Tag: Binary Tree
 * Tag: Binary Search Tree
 * Tag: Recursion
 */
public class ConvertSortedArrayToBinarySearchTree {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }

        return sortedArrayToBSTHelper(nums, 0, nums.length-1);
    }

    private TreeNode sortedArrayToBSTHelper(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }

        int mid = start + (end - start) / 2;

        TreeNode node = new TreeNode(nums[mid]);
        node.left = sortedArrayToBSTHelper(nums, start, mid - 1);
        node.right = sortedArrayToBSTHelper(nums, mid + 1, end);

        return node;
    }
}