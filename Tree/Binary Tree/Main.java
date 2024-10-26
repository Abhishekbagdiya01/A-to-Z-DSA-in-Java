public class Main {
  public static void main(String[] args) {
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
    binaryTree.insert("N10");
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
   
    binaryTree.levelOrder();
    
  }
}
