package com.leetcode.algorithm.ConvertSortedListToBinarySearchTree;

import com.leetcode.data.ListNode;
import com.leetcode.data.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConvertSortedListToBinarySearchTreeTest {
    @Test
    public void sortedListToBST() throws Exception {
        ListNode ln1 = new ListNode(1);
        ListNode ln2 = new ListNode(2);
        ListNode ln3 = new ListNode(3);
        ListNode ln4 = new ListNode(4);
        ListNode ln5 = new ListNode(5);
        ListNode ln6 = new ListNode(6);

        ln1.next = ln2;
        ln2.next = ln3;
        ln3.next = ln4;
        ln4.next = ln5;
        ln5.next = ln6;

        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        TreeNode n6 = new TreeNode(6);

        n4.left = n2;
        n4.right = n6;

        n2.left = n1;
        n2.right = n3;

        n6.left = n5;

        TreeNode r = new ConvertSortedListToBinarySearchTree().sortedListToBST(ln1);
        TreeNode.equal(n4, r);
    }
}