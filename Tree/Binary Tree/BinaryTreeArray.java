public class BinaryTreeArray {
  String[] arr;
  int lastUsedIndex;

  BinaryTreeArray(int size){
    arr = new String[size + 1];
    this.lastUsedIndex=0;
    System.out.println("Binary Tree of size " + size + "has been created");
  }

  // isFull - check if array is full or not
  boolean isFull(){
    if (arr.length-1 == lastUsedIndex) {
      return true;
    }else{
      return false;
    }
  }
  
  // Insert method
  void insert(String value){
    if (!isFull()) {
     arr[lastUsedIndex+1] = value;
     lastUsedIndex++;
     System.out.println("The value of " + value + " inserted in Binary Tree"); 
    }
    else{
      System.out.println("The Binary Tree is full");
    }
  }

  // Pre-Order Traversal
  void preOrder(int index){
    if (index>lastUsedIndex) {
      return;
    }
    System.out.print(arr[index]+ " ");
    preOrder(index *2);
    preOrder(index *2 + 1);
  }
   // In-Order Traversal
  void inOrder(int index){
    if (index>lastUsedIndex) {
      return;
    }
    inOrder(index *2);
    System.out.print(arr[index]+ " ");
    inOrder(index *2 + 1);
  }
 // Post-Order Traversal
  void postOrder(int index){
    if (index>lastUsedIndex) {
      return;
    }
    postOrder(index *2);
    postOrder(index *2 + 1);
    System.out.print(arr[index]+ " ");
  }
  // Level-Order Traversal
  void levelOrder(){
    for (int i = 1 ; i<arr.length;i++) {
      System.out.print(arr[i] +" ");
    }
    System.out.println();
  }
  // Search method
  int search(String value){
    for (int i = 1 ; i<arr.length;i++) {
      if (arr[i] == value) {
        System.out.println(value + " exist in the Binary Tree at index "+i);
       return i;    
      }
    }
    System.out.println(value + " doesn't exist in the Binary Tree");
    return -1;
  }

}
