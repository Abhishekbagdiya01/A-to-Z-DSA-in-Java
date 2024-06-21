public class Stack {
  LinkedList linkedList = new LinkedList();
public boolean isEmpty(){
    if (linkedList.head==null) {
      return true;
    } else {
      return false;
    }
  }

  public void push(int value){
    linkedList.insertInLinkedList(value,0);
    System.out.println(value + " is inserted");
  }
    public int pop(){
    if (isEmpty()) {
      System.out.println("Stack is empty");
      return 0;
    }else{
      int value  =  linkedList.head.value;
      linkedList.deleteNode(0);
      System.out.println(value + " is Popped");
      return value;
    }
  }
  public void deleteStack(){
    linkedList.head = null;  
    System.out.println("Stack is deleted");
  }
}
