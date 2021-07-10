package algorithm.oddEvenLinkedList;

import algorithm.ListNode;

class Solution {
  public ListNode oddEvenList(ListNode head) {
    if (head == null || head.next == null) {
      return head;
    }

    ListNode oddTail = head;
    ListNode eventHead = head.next;
    ListNode evenTail = head.next;

    ListNode node = evenTail.next;
    boolean isOdd = true;

    while (node != null) {
      if (isOdd) {
        oddTail.next = node;
        oddTail = node;
      } else {
        evenTail.next = node;
        evenTail = node;
      }

      node = node.next;
      isOdd = !isOdd;
    }

    oddTail.next = eventHead;
    evenTail.next = null;

    return head;
  }
}