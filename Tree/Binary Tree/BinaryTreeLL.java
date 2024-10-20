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

  boolean search(String value) {
    Queue<BinaryNode> queue = new LinkedList<>();
    queue.add(root);
    while (!queue.isEmpty()) {
      BinaryNode node = queue.remove();
      if (node.value == value) {
        return true;
      } else {
        if (node.leftChild != null) {
          queue.add(node.leftChild);
        }
        if (node.rightChild != null) {
          queue.add(node.rightChild);
        }

      }
    }
    return false;
  }

  void insert(String value) {
    BinaryNode newNode = new BinaryNode();
    newNode.value = value;
    if (root == null) {
      root = newNode;
      System.out.println("Inserted new node at root");
      return;
    }
    Queue<BinaryNode> queue = new LinkedList<>();
    queue.add(root);
    while (!queue.isEmpty()) {
      BinaryNode node = queue.remove();
      if (node.leftChild == null) {
        node.leftChild = newNode;
        System.out.println("Successfully Inserted");
        break;
      } else if (node.rightChild == null) {
        node.rightChild = newNode;
        System.out.println("Successfully Inserted");
        break;
      } else {
        queue.add(node.leftChild);
        queue.add(node.rightChild);
      }
    }

  }
}
