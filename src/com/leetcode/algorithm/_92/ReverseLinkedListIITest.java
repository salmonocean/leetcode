package com.leetcode.algorithm._92;

import com.leetcode.data.ListNode;
import org.junit.Test;

public class ReverseLinkedListIITest {
    @Test
    public void reverseBetween() throws Exception {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        ListNode r = new ReverseLinkedListII().reverseBetween(n1, 2, 4);
    }

}