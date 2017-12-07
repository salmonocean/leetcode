package com.leetcode.algorithm._141;

import com.leetcode.data.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListCycleTest {
    @Test
    public void hasCycle() throws Exception {
        ListNode n00 = new ListNode(0);
        ListNode n01 = new ListNode(1);
        ListNode n02 = new ListNode(2);
        ListNode n03 = new ListNode(3);
        ListNode n04 = new ListNode(4);
        n00.next = n01;
        n01.next = n02;
        n02.next = n03;
        n03.next = n04;
        n04.next = n03;

        ListNode n10 = new ListNode(0);

        ListNode n20 = new ListNode(0);
        ListNode n21 = new ListNode(0);
        ListNode n22 = new ListNode(0);
        ListNode n23 = new ListNode(0);
        ListNode n24 = new ListNode(0);
        n20.next = n21;
        n21.next = n22;
        n22.next = n23;
        n23.next = n24;

        ListNode[] inputs = {
                n00,
                n10,
                n20
        };

        boolean[] results = {
                true,
                false,
                false
        };

        for (int i = 0; i < results.length; i++) {
            assertEquals(results[i], new LinkedListCycle().hasCycle(inputs[i]));
        }
    }

}