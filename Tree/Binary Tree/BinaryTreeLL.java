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

  // Insert in Binary Tree
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

  // Depest Node in Binary Tree
  public BinaryNode getDeepestNode() {
    Queue<BinaryNode> queue = new LinkedList<>();
    queue.add(root);
    BinaryNode node = null;
    while (!queue.isEmpty()) {
      node = queue.remove();
      if (node.leftChild != null) {
        queue.add(node.leftChild);
      }
      if (node.rightChild != null) {
        queue.add(node.rightChild);
      }
    }
    return node;
  }

  // delete deepest node
  public void deleteDeepestNode() {
    Queue<BinaryNode> queue = new LinkedList<>();
    queue.add(root);
    BinaryNode currentNode, prevNode = null;

    while (!queue.isEmpty()) {
      currentNode = queue.remove();
      if (currentNode.leftChild == null) {
        currentNode.rightChild = null;
        return;
      }
      if (currentNode.rightChild == null) {
        currentNode.leftChild = null;
        return;
      }
      queue.add(currentNode.leftChild);
      queue.add(currentNode.rightChild);

    }
  }

  // Delete Node
  public void deleteNode(String value) {
    Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
    queue.add(root);
    while (!queue.isEmpty()) {
      BinaryNode node = queue.remove();
      if (node.value == value) {
        node.value = getDeepestNode().value;
        deleteDeepestNode();
        System.out.println("The node is deleted");
        return;
      } else {
        if (node.leftChild != null) {
          queue.add(node.leftChild);
        }
        if (node.leftChild != null) {
          queue.add(node.rightChild);
        }
      }
    }
  System.out.println("The node does not exist in BT");
  }
}
