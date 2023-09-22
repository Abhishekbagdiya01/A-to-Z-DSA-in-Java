public class Main {

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.createDLL(12);
        System.out.println(dll.head.value);
    }
}