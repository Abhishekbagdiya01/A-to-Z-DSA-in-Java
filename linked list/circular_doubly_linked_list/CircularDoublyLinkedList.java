public class CircularDoublyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    // Creation of Circular Doubly LinkedList
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

    // Insertion in Circular Doubly LinkedList

    public void insertInDCLL(int nodeValue, int location) {
        Node node = new Node();
        node.value = nodeValue;

        if (head == null) {
            createCDLL(nodeValue);
            return;
        } else if (location == 0) {
            node.prev = node;
            node.next = head;
            head.prev = node;

            head = node;
            tail.next = head;
        } else if (location >= size) {
            node.prev = tail;
            node.next = head;
            tail.next = node;
            tail = node;

        } else {
            Node tempNode = head;
            for (int i = 0; i < location - 1; i++) {
                tempNode = tempNode.next;
            }
            node.prev = tempNode;
            node.next = tempNode.next;
            node.next.prev = node;
            tempNode.next = node;

        }

        size++;
    }

}