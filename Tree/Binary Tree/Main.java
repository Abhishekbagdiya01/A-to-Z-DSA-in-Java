public class Main {
  public static void main(String[] args) {

    // BINARY TREE USING LINKEDLIST
    BinaryTreeLL binaryTree = new BinaryTreeLL();
    binaryTree.insert("N1");
    binaryTree.insert("N2");
    binaryTree.insert("N3");
    binaryTree.insert("N4");
    binaryTree.insert("N5");
    binaryTree.insert("N6");
    binaryTree.insert("N7");
    binaryTree.insert("N8");
    binaryTree.insert("N9");
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

    binaryTree.deleteNode("N6");
    binaryTree.deleteBT();

    // BINARY TREE USING ARRAY
    System.out.println("------BINARY TREE USING ARRAY-----");
    BinaryTreeArray bTArray = new BinaryTreeArray(9);
    bTArray.insert("N1");
    bTArray.insert("N2");
    bTArray.insert("N3");
    bTArray.insert("N4");
    bTArray.insert("N5");
    bTArray.insert("N6");
    bTArray.insert("N7");
    bTArray.insert("N8");
    bTArray.insert("N9");
    
    System.out.println("Pre-Order Traversal");
    bTArray.preOrder(1);
    System.out.println();
    System.out.println("In-Order Traversal");
    bTArray.inOrder(1);
    System.out.println();
     System.out.println("Post-Order Traversal");
    bTArray.postOrder(1);
    System.out.println("Level-Order Traversal");
    bTArray.levelOrder();
    bTArray.search("N4");
    bTArray.delete("N4");
    bTArray.levelOrder();
  }
}
