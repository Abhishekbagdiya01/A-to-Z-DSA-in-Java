public class DoublyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    // Creation of DoublyLinkedList
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

    // Insertion in DoublyLinkedList
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

    // Traversal in DoublyLinkedList
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

    // Reverse Traversal in DoublyLinkedList
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

    // Searching in DoublyLinkedList
    public boolean searchNodeInDLL(int nodeValue) {
        if (head != null) {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {

                if (tempNode.value == nodeValue) {
                    System.out.println(nodeValue + " founded at location : " + i);
                    return true;
                }
                tempNode = tempNode.next;
            }

        }
        System.out.println(nodeValue + " doesn't found at any node ");
        return false;
    }

    // Deletion in DoublyLinkedList
    public void deleteNodeInDLL(int location) {
        if (head == null) {
            System.out.println("Doubly LinkedList doesn't exist");
        } else if (location == 0) {

            head = head.next;
            head.prev = null;
            size--;
            if (size == 0) {
                head = null;
                tail = null;
            }
        } else if (location >= size) {
            Node tempNode = head;
            for (int i = 0; i < size - 1; i++) {
                tempNode = tempNode.next;
            }

            tail = tempNode.prev;
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

    // Deletion of DoublyLinkedList
    public void deleteDll() {
        if (head != null) {

            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                tempNode.prev = null;
                tempNode = tempNode.next;
            }
            head = null;
            tail = null;
            System.out.println("Doubly LinkedList deleted!");
        } else {
            System.out.println("Circular Singly LinkedList doesn't exist  ");
        }
    }
}
