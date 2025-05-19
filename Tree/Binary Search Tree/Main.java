public class Main {
  public static void main(String[] args) {
    BinarySearchTree bST = new BinarySearchTree();
    bST.insert(70);
    bST.insert(50);
    bST.insert(90);
    bST.insert(30);
    bST.insert(60);
    bST.insert(100);
    bST.insert(20);
    bST.insert(40);

    // In Order Traversal
    System.out.println("InOrder Traversal");
    bST.inOrderTraversal(bST.root);
    System.out.println();
    // Pre Order Traversal
    System.out.println("PreOrder Traversal");
    bST.preOrderTraversal(bST.root);
    System.out.println();
    // Post Order Traversal
    System.out.println("PostOrder Traversal");
    bST.postOrderTraversal(bST.root);
    System.out.println();
    // Level Order Traversal BFS
    System.out.println("LevelOrder Traversal");
    bST.levelOrderTraversal(bST.root);
    System.out.println();

    // Searching in bST
    System.out.println("Searching value : " + bST.search(55));

    // Deleting Node
    System.out.println("Deleting Node");
    bST.deleteNode(bST.root, 70);
    bST.inOrderTraversal(bST.root);
    System.out.println();

    // Deleting the whole bST
    bST.deleteBST();
  }
}
