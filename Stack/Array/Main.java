class Main{
 public static void main(String [] args) {
  Stack sk = new Stack();
  sk.createStack(5);
//System.out.println(sk.isEmpty());
//System.out.println(sk.isFull());
sk.push(5);
sk.push(4);
sk.push(3);
sk.push(2);

sk.push(1);
sk.push(5465);
sk.push(3353);

sk.readStack();
System.out.println("----------------");
sk.pop();
/*sk.pop();
sk.pop();
sk.pop();
sk.pop();
sk.pop();
sk.readStack();
*/
sk.deleteStack();
sk.readStack();
}

}