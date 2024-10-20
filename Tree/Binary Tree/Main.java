public class Main {
  public static void main(String[] args) {
    BinaryTreeLL binaryTree = new BinaryTreeLL();
    BinaryNode n1 = new BinaryNode();
    n1.value = "N1";
    BinaryNode n2 = new BinaryNode();
    n2.value = "N2";
    BinaryNode n3 = new BinaryNode();
    n3.value = "N3";
    BinaryNode n4 = new BinaryNode();
    n4.value = "N4";
    BinaryNode n5 = new BinaryNode();
    n5.value = "N5";
    BinaryNode n6 = new BinaryNode();
    n6.value = "N6";
    BinaryNode n7 = new BinaryNode();
    n7.value = "N7";
    BinaryNode n8 = new BinaryNode();
    n8.value = "N8";
    BinaryNode n9 = new BinaryNode();
    n9.value = "N9";

    n1.leftChild = n2;
    n1.rightChild = n3;

    n2.leftChild = n4;
    n2.rightChild = n5;

    n3.leftChild = n6;
    n3.rightChild = n7;

    n4.leftChild = n8;
    n4.rightChild = n9;

    binaryTree.root = n1;
    System.out.println("Pre-Order Traversal");
    binaryTree.preOrder(binaryTree.root);
    System.out.println();
    System.out.println("In-Order Traversal");
    binaryTree.inOrder(binaryTree.root);
    System.out.println();
    System.out.println("Post-Order Traversal");
    binaryTree.postOrder(binaryTree.root);
    System.out.println();
    System.out.println("Level Order Traversal");
    binaryTree.levelOrder();
    System.out.println(binaryTree.search("N6"));
  }
}
