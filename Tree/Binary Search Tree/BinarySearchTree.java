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

  boolean search(int value) {
    return searchNode(root, value);
  }

  private boolean searchNode(BinaryNode node, int value) {
    if (node == null)
      return false;
    if (node.value == value) {
      return true;
    }

    if (value < node.value)
      return searchNode(node.left, value);
    else
      return searchNode(node.right, value);
  }

  private BinaryNode minimumNode(BinaryNode node) {
    if (node.left == null) {
      return node;
    } else {
      return minimumNode(node.left);
    }
  }

  public BinaryNode deleteNode(BinaryNode node, int value) {
    if (node == null) {
      System.out.println("Value not found in BST");
      return null;
    }
    if (value < node.value) {
      node.left = deleteNode(node.left, value);
    } else if (value > node.value) {
      node.right = deleteNode(node.right, value);
    } else {
      if (node.left != null && node.right != null) {
        BinaryNode tempNode = node;
        BinaryNode minRightNode = minimumNode(node.right);
        node.value = minRightNode.value;
        node.right = deleteNode(node.right, minRightNode.value);
      } else if (node.left != null) {
        node = node.left;
      } else if (node.right != null) {
        node = node.right;
      } else {
        node = null;
      }
    }
    return node;
  }

  public void deleteBST() {
    root = null;
    System.out.println("Binary Search Tree has been deleted");
  }
}
