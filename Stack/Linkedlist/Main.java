public class Main {
  public static void main(String[] args) {
Stack stack = new Stack();
stack.push(2);
stack.push(4);
stack.push(6);
stack.push(8);
stack.push(10);
System.out.println( stack.pop());
stack.deleteStack();
System.out.println(stack.isEmpty());
  }
}
