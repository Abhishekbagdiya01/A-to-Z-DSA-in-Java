public class Main {
    public static void main(String[] args) {
        CircularDoublyLinkedList cDLL = new CircularDoublyLinkedList();

        cDLL.createCDLL(14);

        cDLL.insertInDCLL(78, 1);
        cDLL.insertInDCLL(5, 2);
        cDLL.insertInDCLL(52, 3);
        cDLL.insertInDCLL(19, 4);

        cDLL.traversalInCDLL();
        cDLL.reverseTraversalInCDLL();
        cDLL.searchingInCDLL(5);
        cDLL.deleteInCDLL(3);
        cDLL.deleteCDLL();
        cDLL.traversalInCDLL();
    }
}
