public class DoublyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public Node createDLL(int nodeValue) {
        Node node = new Node();
        head = new Node();
        node.value = nodeValue;
        node.prev = null;
        node.next = null;
        head = node;
        tail = node;
        size = 1;
        return head;
    }
}
