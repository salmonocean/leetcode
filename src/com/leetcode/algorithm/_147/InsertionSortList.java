package com.leetcode.algorithm._147;

import com.leetcode.data.ListNode;

/**
 * @see https://leetcode.com/problems/insertion-sort-list/description/
 * Tag: Linked list
 * Tag: Sort
 */
public class InsertionSortList {
    public ListNode insertionSortList(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode node = head;

        while (node != null) {
            ListNode next = node.next;
            ListNode insert = dummy;

            while (insert.next != null && insert.next.val < node.val) {
                insert = insert.next;
            }

            ListNode tmp = insert.next;
            insert.next = node;
            node.next = tmp;

            node = next;
        }

        return dummy.next;
    }
}
