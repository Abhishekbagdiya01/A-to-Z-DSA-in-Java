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

    // Traversal in Circular Singly LinkedList
    public void traversalInCSLL() {
        if (head != null) {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                if (i != size - 1) {
                    System.out.print(" -> ");
                }
                tempNode = tempNode.next;
            }

        } else {
            System.out.println("Circular Singly LinkedList doesn't exist");
        }
        System.out.println();
    }

    // Searching in Circular Singly LinkedList
    public boolean SearchingInCSLL(int nodeValue) {
        if (head != null) {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                if (tempNode.value == nodeValue) {
                    System.out.println(nodeValue + " Found at location : " + i);
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println(nodeValue + " doesn't found at any node ");
        return false;
    }
}
