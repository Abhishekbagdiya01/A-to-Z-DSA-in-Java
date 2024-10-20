import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeLL {
  BinaryNode root;

  BinaryTreeLL() {
    this.root = null;
  }

  // Pre-Order Traversal
  void preOrder(BinaryNode node) {
    if (node == null) {
      return;
    }
    System.out.print(node.value + " ");
    preOrder(node.leftChild);
    preOrder(node.rightChild);
  }

  // In-Order Traversal
  void inOrder(BinaryNode node) {
    if (node == null) {
      return;
    }
    inOrder(node.leftChild);
    System.out.print(node.value + " ");
    inOrder(node.rightChild);
  }

  // Post-Order Traversal
  void postOrder(BinaryNode node) {
    if (node == null) {
      return;
    }
    postOrder(node.leftChild);
    postOrder(node.rightChild);
    System.out.print(node.value + " ");
  }

  // Level-Order Traversal
  void levelOrder() {
    Queue<BinaryNode> queue = new LinkedList<>();
    queue.add(root);

    while (!queue.isEmpty()) {
      BinaryNode node = queue.remove();
      System.out.print(node.value + " ");
      if (node.leftChild != null) {
        queue.add(node.leftChild);
      }
      if (node.rightChild != null) {
        queue.add(node.rightChild);
      }
    }
    System.out.println();
  }
}
