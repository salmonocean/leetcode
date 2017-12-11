package com.leetcode.algorithm._117;

import com.leetcode.data.TreeLinkNode;

/**
 * @see https://leetcode.com/problems/populating-next-right-pointers-in-each-node-ii/description/
 * Tag: Tree
 */
public class PopulatingNextRightPointersInEachNodeII {

    public void connect(TreeLinkNode root) {
        TreeLinkNode head = new TreeLinkNode(0);
        TreeLinkNode node, prev;

        node = root;
        while (node != null) {
            head.next = null;
            prev = head;

            while (node != null) {
                if (node.left != null) {
                    prev.next = node.left;
                    prev = prev.next;
                }
                if (node.right != null) {
                    prev.next = node.right;
                    prev = prev.next;
                }

                node = node.next;
            }

            node = head.next;
        }
    }
}