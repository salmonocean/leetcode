package com.leetcode.algorithm;

import com.leetcode.data.TreeLinkNode;

/**
 * @see https://leetcode.com/problems/populating-next-right-pointers-in-each-node/description/
 * No.: 116
 * Tag: Tree
 * Tag: Recursion
 */
public class PopulatingNextRightPointersInEachNode {
    public static void main(String[] args) {
    }

    public void connect(TreeLinkNode root) {
        // IMPORTANT: Please reset any member data you declared, as
        // the same Solution instance will be reused for each test case.
        TreeLinkNode node, lnode;
        if (root == null)
            return;
        root.next = null;
        lnode = root;

        while (lnode != null && lnode.left != null) {
            node = lnode;
            while (node != null) {
                node.left.next = node.right;
                node.right.next = (node.next != null) ? node.next.left : null;

                node = node.next;
            }
            lnode = lnode.left;
        }
    }

    public void connect1(TreeLinkNode root) {
        // IMPORTANT: Please reset any member data you declared, as
        // the same Solution instance will be reused for each test case.
        if (root == null || root.left == null)
            return;

        root.left.next = root.right;
        root.right.next = (root.next != null) ? root.next.left : null;

        connect(root.left);
        connect(root.right);
    }
}
