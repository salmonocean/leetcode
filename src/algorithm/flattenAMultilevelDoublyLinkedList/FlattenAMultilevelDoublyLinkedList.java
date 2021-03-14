package algorithm.flattenAMultilevelDoublyLinkedList;

import algorithm.Node;
import javafx.util.Pair;

public class FlattenAMultilevelDoublyLinkedList {
  public Node flatten(Node head) {
    flattenInternal(head);

    return head;
  }

  private Pair<Node, Node> flattenInternal(Node head) {
    Node node = head;
    Node tail = null;

    while (node != null) {
      if (node.child != null) {
        Pair<Node, Node> tmp = flattenInternal(node.child);

        tmp.getValue().next = node.next;
        if (node.next != null) {
          node.next.prev = tmp.getValue();
        }

        tmp.getKey().prev = node;
        node.next = tmp.getKey();

        tail = tmp.getValue();
        node.child = null;
      } else {
        tail = node;
      }

      node = tail.next;
    }

    return new Pair<>(head, tail);
  }
}
