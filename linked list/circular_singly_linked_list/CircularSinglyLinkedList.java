public class CircularSinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    // Creation of Circular Singly LinkedList
    public Node createCSLL(int nodeValue) {
        Node node = new Node();
        head = new Node();

        node.value = nodeValue;
        node.next = node;
        head = node;
        tail = node;

        size = 1;
        return head;
    }
}
