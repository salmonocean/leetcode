package algorithm.addTwoNumbers;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ListNode {
  int val;
  ListNode next;

  public ListNode() {
  }

  public ListNode(int val) {
    this.val = val;
  }

  public ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }

  public int[] toArray() {
    List<Integer> list = new ArrayList<>();

    ListNode node = this;
    while (node != null) {
      list.add(node.val);
      node = node.next;
    }

    return list.stream().mapToInt(Integer::intValue).toArray();
  }

  public static ListNode fromArray(int[] array) {
    if (array == null || array.length == 0) {
      return null;
    }

    ListNode head = new ListNode(array[0]);
    ListNode prev = head;

    for (int i = 1; i < array.length; i++) {
      ListNode node = new ListNode(array[i]);

      prev.next = node;
      prev = node;
    }

    return head;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == this) {
      return true;
    }

    if (!(obj instanceof ListNode)) {
      return false;
    }

    ListNode that = (ListNode) obj;
    return val == that.val && Objects.equals(next, that.next);
  }
}

