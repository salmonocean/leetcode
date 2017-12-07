package com.leetcode.algorithm._147;

import com.leetcode.data.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class InsertionSortListTest {
    @Test
    public void insertionSortList() throws Exception {
        ListNode n01 = new ListNode(0);
        ListNode n02 = new ListNode(1);
        ListNode n03 = new ListNode(2);
        ListNode n04 = new ListNode(3);
        ListNode n05 = new ListNode(4);
        n01.next = n02;
        n02.next = n03;
        n03.next = n04;
        n04.next = n05;

        ListNode n11 = new ListNode(0);

        ListNode n21 = new ListNode(2);
        ListNode n22 = new ListNode(5);
        ListNode n23 = new ListNode(1);
        ListNode n24 = new ListNode(3);
        ListNode n25 = new ListNode(4);
        n21.next = n22;
        n22.next = n23;
        n23.next = n24;
        n24.next = n25;

        ListNode[] inputs = {
                n01,
                n11,
                n21
        };

        for (int i = 0; i < inputs.length; i++) {
            assertTrue(assertSortList(new InsertionSortList().insertionSortList(inputs[i])));
        }
    }

    private boolean assertSortList(ListNode head) {
        ListNode prev = null;
        ListNode node = head;

        while (node != null) {
            if (prev != null && prev.val > node.val) {
                return false;
            }

            prev = node;
            node = node.next;
        }

        return true;
    }
}