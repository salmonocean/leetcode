package com.leetcode.algorithm._92;

import com.leetcode.data.ListNode;

/**
 * @see https://leetcode.com/problems/reverse-linked-list-ii/description/
 * Tag: Linked List
 */
public class ReverseLinkedListII {

    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (m == n) {
            return head;
        }

        ListNode node = head;
        ListNode prev = null;

        ListNode prevM, nodeM, tmp;

        for (int i = 1; i < m; i++) {
            prev = node;
            node = node.next;
        }

        prevM = prev;
        nodeM = node;

        for (int i = 0; i <= n-m; i++) {
            tmp = node.next;
            node.next = prev;
            prev = node;
            node = tmp;
        }

        if (prevM != null) {
            prevM.next = prev;
        } else {
            head = prev;
        }
        nodeM.next = node;

        return head;
    }

    public ListNode reverseBetween1(ListNode head, int m, int n) {
        if (m == n) {
            return head;
        }

        int i = 1;
        ListNode node = head;
        ListNode prev = null;

        ListNode prevM, nodeM, tmp;
        prevM = nodeM = null;
        boolean reverse = false;
        boolean shouldBreak = false;

        while (node != null) {
            if (i == m) {
                prevM = prev;
                nodeM = node;
                reverse = true;
            } else if (i == n) {
                if (prevM != null) {
                    prevM.next = node;
                } else {
                    head = node;
                }
                nodeM.next = node.next;
                shouldBreak = true;
            }

            if (reverse) {
                tmp = node.next;
                node.next = prev;
                prev = node;
                node = tmp;
            } else {
                prev = node;
                node = node.next;
            }

            if (shouldBreak) {
                break;
            }

            i++;
        }

        return head;
    }
}
