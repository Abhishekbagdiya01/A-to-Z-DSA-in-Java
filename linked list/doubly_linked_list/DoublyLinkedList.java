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

    // Insertion method
    public void insertNodeInDLL(int nodeValue, int location) {
        Node node = new Node();
        node.value = nodeValue;
        if (head == null) {
            createDLL(nodeValue);
            return;
        } else if (location == 0) {
            node.prev = null;
            node.next = head;
            head.prev = node;
            head = node;
        } else if (location >= size) {
            node.next = null;
            node.prev = tail;
            tail.next = node;
            tail = node;
        } else {
            Node tempNode = head;
            for (int i = 0; i < location - 1; i++) {
                tempNode = tempNode.next;
            }
            node.next = tempNode.next;
            node.prev = tempNode;
            node.next.prev = node;
            tempNode.next = node;
        }

        size++;
    }

    public void traversalInDLL() {
        if (head != null) {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                if (i < size - 1) {
                    System.out.print("->");
                }
                tempNode = tempNode.next;
            }
            System.out.println();
        } else {
            System.out.println("Doubly LinkedList doesn't exist");
        }
    }

    public void reverseTraversalInDLL() {
        if (head != null) {
            Node tempNode = tail;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                if (i < size - 1) {
                    System.out.print("<-");
                }
                tempNode = tempNode.prev;
            }
            System.out.println();
        } else {
            System.out.println("Doubly LinkedList doesn't exist");
        }
    }
}
