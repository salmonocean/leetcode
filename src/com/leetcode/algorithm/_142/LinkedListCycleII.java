package com.leetcode.algorithm._142;

import com.leetcode.data.ListNode;

/**
 * @see https://leetcode.com/problems/linked-list-cycle-ii/description/
 * Tag: Linked List
 */
public class LinkedListCycleII {
    public ListNode detectCycle(ListNode head) {
        // IMPORTANT: Please reset any member data you declared, as
        // the same Solution instance will be reused for each test case.
        ListNode fast, slow, start;
        fast = slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (fast == slow) {
                start = head;
                while (slow != start) {
                    slow = slow.next;
                    start = start.next;
                }

                return start;
            }
        }
        return null;
    }
}
