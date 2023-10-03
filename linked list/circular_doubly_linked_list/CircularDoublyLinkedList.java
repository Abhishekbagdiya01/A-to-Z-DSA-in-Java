public class CircularDoublyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public Node createCDLL(int nodeValue) {

        if (head == null) {
            Node node = new Node();
            head = new Node();

            node.value = nodeValue;
            node.next = node;
            node.prev = node;

            head = tail = node;
            size = 1;

        } else {
            System.out.println("Circular Doubly Linked List already exist");
        }
        return head;
    }
}
