public class Main {
    public static void main(String[] args) {
        CircularDoublyLinkedList cDLL = new CircularDoublyLinkedList();

        cDLL.createCDLL(14);
        // System.out.println(cDLL.tail.value);
        cDLL.insertInDCLL(78, 1);
        cDLL.insertInDCLL(5, 2);

        cDLL.traversalInCDLL();
        cDLL.reverseTraversalInCDLL();
        cDLL.searchingInCDLL(5);
    }
}
