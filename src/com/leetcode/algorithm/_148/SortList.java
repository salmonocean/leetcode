package com.leetcode.algorithm._148;

import com.leetcode.data.ListNode;

/**
 * @see https://leetcode.com/problems/sort-list/description/
 * Tag: Linked list
 * Tag: Sort
 */
public class SortList {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode middle, right;
        middle = findMiddle(head);
        right = middle.next;
        middle.next = null;
        return merge(sortList(head), sortList(right));
    }

    private ListNode findMiddle(ListNode head) {
        ListNode slow, fast, prev;

        slow = fast = head;
        prev = slow;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        return prev;
    }

    private ListNode merge(ListNode list1, ListNode list2) {
        if (list1 == null)
            return list2;
        if (list2 == null)
            return list1;

        ListNode head, node;
        head = new ListNode(1);
        node = head;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                node.next = list1;
                list1 = list1.next;
            } else {
                node.next = list2;
                list2 = list2.next;
            }
            node = node.next;
        }

        if (list1 != null)
            node.next = list1;
        if (list2 != null)
            node.next = list2;

        return head.next;
    }
}
