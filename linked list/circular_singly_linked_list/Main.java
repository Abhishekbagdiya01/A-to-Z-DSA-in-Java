public class Main {
    public static void main(String[] args) {
        CircularSinglyLinkedList csll = new CircularSinglyLinkedList();

        csll.createCSLL(5);
        csll.insertionInCSLL(2, 0);
        csll.insertionInCSLL(4, 1);
        csll.insertionInCSLL(6, 2);
        csll.insertionInCSLL(8, 3);
        csll.insertionInCSLL(10, 4);
        System.out.println("Size is : " + csll.size);

        csll.traversalInCSLL();
        csll.SearchingInCSLL(12);
    }
}
