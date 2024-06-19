public class Stack{
int[] arr;
int topOfStack;

public void createStack(int size){
  this.arr = new int[size];
  this.topOfStack = -1;
  System.out.println("Stack has been created");

}
public void readStack(){
 if (isEmpty()) {
  System.out.println("Stack is empty");
 }else{
for (int i : arr) {
    System.out.println(i);
  }
 }
}
public boolean isEmpty(){
  if (topOfStack == -1) {
   return true;
  }else{
    return false;
  }
}
public boolean isFull(){
  if (topOfStack == arr.length-1) {
  return true;
  }else{
    return false;
  }

}
public void push(int value){
if (isFull()) {
  System.out.println("Stack is FUll");
}else{
  arr[topOfStack+1] = value;
  topOfStack++;
  System.out.println("Value is inseted");
}
}
public void pop(){
if (isEmpty()) {
  System.out.println("Stack is Empty");
}else{
 arr[topOfStack] = Integer.MIN_VALUE;  // We can't remove value from array so we set value to minimum integer value 
  topOfStack--;

  System.out.println("Value is removed");
}
}
public void deleteStack(){
  arr = null;
  topOfStack = -1;
  System.out.println("Stack deleted successfully");
}

}
