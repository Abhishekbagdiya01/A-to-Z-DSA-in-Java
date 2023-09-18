public class Main {
    public static void main(String[] args) {
        CircularSinglyLinkedList csll = new CircularSinglyLinkedList();

        csll.createCSLL(5);
        csll.insertionInCSLL(2, 0);

        System.out.println("Size is : " + csll.size);
        System.out.println(csll.head.value);
    }
}
