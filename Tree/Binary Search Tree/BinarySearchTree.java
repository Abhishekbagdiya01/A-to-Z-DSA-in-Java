import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
  BinaryNode root;

  BinarySearchTree() {
    root = null;
  }

  // Insertion in BST
  private BinaryNode insertNode(BinaryNode currentNode, int value) {
    if (currentNode == null) {
      BinaryNode node = new BinaryNode();
      node.value = value;
      System.out.println("The value successfully inserted");
      return node;
    } else if (value <= currentNode.value) {
      currentNode.left = insertNode(currentNode.left, value);
      return currentNode;
    } else {
      currentNode.right = insertNode(currentNode.right, value);
      return currentNode;
    }
  }

  void insert(int value) {
    root = insertNode(root, value);
  }

  void inOrderTraversal(BinaryNode node) {
    if (node == null)
      return;
    inOrderTraversal(node.left);
    System.out.print(node.value + " ");
    inOrderTraversal(node.right);
  }

  void preOrderTraversal(BinaryNode node) {
    if (node == null)
      return;
    System.out.print(node.value + " ");
    preOrderTraversal(node.left);
    preOrderTraversal(node.right);
  }

  void postOrderTraversal(BinaryNode node) {
    if (node == null)
      return;
    postOrderTraversal(node.left);
    postOrderTraversal(node.right);
    System.out.print(node.value + " ");
  }

  void levelOrderTraversal(BinaryNode node) {
    Queue<BinaryNode> queue = new LinkedList<>();
    queue.offer(node);
    while (!queue.isEmpty()) {
      BinaryNode tempNode = queue.poll();
      System.out.print(tempNode.value + " ");

      if (tempNode.left != null)
        queue.offer(tempNode.left);
      if (tempNode.right != null)
        queue.offer(tempNode.right);
    }
  }
}
