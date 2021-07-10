package algorithm.deleteNodeInALinkedList;

import algorithm.ListNode;

class Solution {
  public void deleteNode(ListNode node) {
    node.val = node.next.val;
    node.next = node.next.next;
  }
}
