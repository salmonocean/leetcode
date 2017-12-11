package com.leetcode.algorithm._109;

import com.leetcode.data.ListNode;
import com.leetcode.data.TreeNode;

/**
 * @see https://leetcode.com/problems/convert-sorted-list-to-binary-search-tree/description/
 * Tag: Binary Tree
 * Tag: Binary Search Tree
 * Tag: Recursion
 * Tag: Fast and Slow Pointers
 */
public class ConvertSortedListToBinarySearchTree {
    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode slow, fast, prev;

        slow = fast = head;
        prev = null;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        TreeNode tn = new TreeNode(slow.val);
        if (prev != null) {
            prev.next = null;
            tn.left = sortedListToBST(head);
        }
        tn.right = sortedListToBST(slow.next);

        return tn;
    }
}