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

   void Insert(int value) {
      insertNode(root, value);
   }
}
