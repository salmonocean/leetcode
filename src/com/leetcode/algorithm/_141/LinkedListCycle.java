package com.leetcode.algorithm._141;

import com.leetcode.data.ListNode;

/**
 * @see https://leetcode.com/problems/linked-list-cycle/description/
 * Tag: Linked List
 */
public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        // IMPORTANT: Please reset any member data you declared, as
        // the same Solution instance will be reused for each test case.
        if (head == null) return false;
        ListNode fast, slow;
        fast = slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
                return true;
        }

        return false;
    }
}
