package com.leetcode.algorithm._138;

import com.leetcode.data.RandomListNode;

/**
 * @see https://leetcode.com/problems/copy-list-with-random-pointer/description/
 * Tag: Linked List
 * Tag: Basic
 */
public class CopyListWithRandomPointer {
    public RandomListNode copyRandomList(RandomListNode head) {
        RandomListNode dup, node, tmp;
        dup = null;

        node = head;
        while (node != null) {
            tmp = new RandomListNode(node.label);
            tmp.next = node.next;
            tmp.random = node.random;

            node.next = tmp;
            node = tmp.next;
        }

        node = head;
        while (node != null) {
            tmp = node.next;
            if (tmp.random != null)
                tmp.random = tmp.random.next;
            node = tmp.next;
        }

        if (head != null) {
            dup = head.next;
        }

        node = head;
        while (node != null) {
            tmp = node.next;
            node.next = tmp.next;
            tmp.next = tmp.next != null ? tmp.next.next : null;
            node = node.next;
        }

        return dup;
    }
}
