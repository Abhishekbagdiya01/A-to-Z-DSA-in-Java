public class Main {

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.createDLL(5);
        // System.out.println(dll.head.value);
        dll.insertNodeInDLL(2, 0);
        dll.insertNodeInDLL(12, 2);
        dll.insertNodeInDLL(15, 4);
        // System.out.println(dll.head.next.value);
        dll.traversalInDLL();
        dll.reverseTraversalInDLL();
        dll.searchNodeInDLL(15);
        dll.deleteNodeInDLL(2);

        dll.traversalInDLL();
        dll.deleteDll();

        dll.traversalInDLL();

    }
}