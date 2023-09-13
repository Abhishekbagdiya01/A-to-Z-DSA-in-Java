public class SingleLinkedList {
    public Node head;
    public Node tail;
    int size;

    public Node createSingleLinkedList(int nodeValue) {

        head = new Node();
        Node node = new Node();

        node.value = nodeValue;
        node.next = null;

        head = node;
        tail = node;
        size = 1;
        // System.out.println(nodeValue);
        return head;
    }
}