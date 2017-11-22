package com.leetcode.algorithm._138;

import com.leetcode.data.RandomListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class CopyListWithRandomPointerTest {
    @Test
    public void copyRandomList() throws Exception {
        RandomListNode n01 = new RandomListNode(1);
        RandomListNode n02 = new RandomListNode(2);
        RandomListNode n03 = new RandomListNode(3);
        RandomListNode n04 = new RandomListNode(4);
        RandomListNode n05 = new RandomListNode(5);

        n01.next = n02;
        n01.random = n04;

        n02.next = n03;
        n02.random = n01;

        n03.next = n04;

        n04.next = n05;
        n04.random = n05;

        n05.random = n03;

        RandomListNode[] inputs = {n01};


        for (int i = 0; i < inputs.length; i++) {
            assertTrue(equal(new CopyListWithRandomPointer().copyRandomList(inputs[i]), inputs[i]));
        }
    }

    private boolean equal(RandomListNode head1, RandomListNode head2) {
        RandomListNode node1 = head1;
        RandomListNode node2 = head2;

        while (node1 != null && node2 != null) {
            if (node1.label != node2.label ||
                    (node1.random == null && node2.random != null) ||
                    (node1.random != null && node2.random == null) ||
                    (node1.random != null && node2.random != null && node1.label != node2.label)) {
                return false;
            }

            node1 = node1.next;
            node2 = node2.next;
        }

        return node1 == null && node2 == null;
    }
}