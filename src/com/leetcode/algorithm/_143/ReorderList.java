package com.leetcode.algorithm._143;

import com.leetcode.data.ListNode;

/**
 * @see https://leetcode.com/problems/reorder-list/description/
 * Tag: Linked List
 */
public class ReorderList {
    /**
     * Three methods of linked list: Mid, Reverse, Merge
     */
    public void reorderList(ListNode head) {
        if (head == null || head.next == null)
            return;

        ListNode slow, fast, prev;
        slow = fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode node, node1, tmp;
        prev = null;
        node = slow.next;
        slow.next = null;
        while (node != null) {
            node1 = node.next;
            node.next = prev;
            prev = node;
            node = node1;
        }

        node = head;
        node1 = prev;
        while (node != null && node1 != null) {
            tmp = node1.next;
            node1.next = node.next;
            node.next = node1;

            node = node1.next;
            node1 = tmp;
        }
    }
}
