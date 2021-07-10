package algorithm.addTwoNumbers;

import algorithm.ListNode;

public class AddTwoNumbers {
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode node1 = l1;
    ListNode node2 = l2;

    int carry = 0;
    ListNode head = null;
    ListNode tail = null;

    while (node1 != null || node2 != null) {
      int sum = carry;
      if (node1 != null) {
        sum += node1.val;
      }
      if (node2 != null) {
        sum += node2.val;
      }

      int value;
      if (sum >= 10) {
        value = sum - 10;
        carry = 1;
      } else {
        value = sum;
        carry = 0;
      }

      ListNode node = new ListNode(value);
      if (head == null) {
        head = node;
      } else {
        tail.next = node;
      }

      tail = node;
      if (node1 != null) {
        node1 = node1.next;
      }
      if (node2 != null) {
        node2 = node2.next;
      }
    }

    if (carry == 1) {
      tail.next = new ListNode(1);
    }

    return head;
  }
}
