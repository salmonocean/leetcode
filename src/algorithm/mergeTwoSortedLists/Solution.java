package algorithm.mergeTwoSortedLists;

import algorithm.ListNode;

class Solution {
  public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    ListNode newHead = new ListNode(0);
    ListNode node = newHead;

    while (l1 != null && l2 != null) {
      if (l1.val <= l2.val) {
        node.next = l1;
        l1 = l1.next;
      } else {
        node.next = l2;
        l2 = l2.next;
      }

      node = node.next;
    }

    if (l1 != null) {
      node.next = l1;
    }
    if (l2 != null) {
      node.next = l2;
    }

    return newHead.next;
  }
}