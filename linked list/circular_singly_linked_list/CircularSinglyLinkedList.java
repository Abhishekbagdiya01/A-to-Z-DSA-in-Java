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
    // Insertion in Circular Singly LinkedList

    public void insertionInCSLL(int nodeValue, int location) {
        Node node = new Node();
        node.value = nodeValue;

        if (head == null) {
            createCSLL(nodeValue);
            return;
        } else if (location == 0) {
            node.next = head;
            head = node;
            tail.next = head;

        } else if (location >= size) {

            tail.next = node;

            tail = node;

            tail.next = head;

        } else {
            Node tempNode = head;
            System.out.println(head.value);
            int index = 0;
            while (index < location - 1) {
                tempNode = tempNode.next;
                index++;
            }
            node.next = tempNode.next;
            tempNode.next = node;
        }

        size++;
    }
}
