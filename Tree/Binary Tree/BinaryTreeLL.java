public class BinaryTreeLL {
  BinaryNode root;

  BinaryTreeLL() {
    this.root = null;
  }

  // Pre-Order Traversal
  void preOrder(BinaryNode node) {
    if (node == null){
      return;
    }
    System.out.print(node.value + " ");
    preOrder(node.leftChild);
    preOrder(node.rightChild);
  }
}
