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
            node.prev = tail;
            node.next = head;
            head.prev = node;
            head = node;
            tail.next = head;
        } else if (location >= size) {
            node.prev = tail;
            node.next = head;

            tail.next = node;
            tail = node;
            head.prev = tail;

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

    // Traversal in Circular Doubly LinkedList
    public void traversalInCDLL() {
        if (head == null) {
            System.out.println("Circular Doubly LinkedList doesn't exist");
        } else {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                if (i < size - 1) {
                    System.out.print("->");
                    tempNode = tempNode.next;
                }
            }
        }
        System.out.println();
    }

    // Traversal in Circular Doubly LinkedList
    public void reverseTraversalInCDLL() {
        if (head == null) {
            System.out.println("Circular Doubly LinkedList doesn't exist");
        } else {
            Node tempNode = tail;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                if (i < size - 1) {
                    System.out.print("<-");
                    tempNode = tempNode.prev;
                }
            }

        }
        System.out.println();
    }

    // Searching in Circular Doubly LinkedList
    public boolean searchingInCDLL(int nodeValue) {
        if (head != null) {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                if (tempNode.value == nodeValue) {
                    System.out.println(nodeValue + " founded at location " + i);
                    return true;
                }
                tempNode = tempNode.next;
            }
            System.out.println(nodeValue + " couldn't find at any location ");

        } else {
            System.out.println("Circular Doubly LinkedList doesn't exist");
        }
        return false;
    }

    // Deletion in Circular Doubly LinkedList
    public void deleteInCDLL(int location) {
        if (head == null) {
            System.out.println("Circular Doubly LinkedList doesn't exist");
        } else if (location == 0) {

            head = head.next;
            head.prev = tail;
            size--;
            if (size == 0) {
                head = null;
                tail.prev = null;
                tail.next = null;
                tail = null;
            }

        } else if (location >= size - 1) {

            tail = tail.prev;
            tail.next = head;
            head.prev = tail;
            size--;
        } else {
            Node tempNode = head;
            for (int i = 0; i < location - 1; i++) {

                tempNode = tempNode.next;

            }

            tempNode.next = tempNode.next.next;
            tempNode.next.prev = tempNode;
            size--;
        }
    }

    public void deleteCDLL() {
        if (head == null) {
            System.out.println("Circular Doubly LinkedList doesn't exist");
        } else {
            head = head.prev = head.next = tail = tail.prev = tail.next = null;
            System.out.println("Circular Doubly LinkedList deleted successfully");
        }
    }
}
