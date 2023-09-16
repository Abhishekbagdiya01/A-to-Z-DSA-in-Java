public class SingleLinkedList {
    public Node head;
    public Node tail;
    static int size;

    public Node createSingleLinkedList(int nodeValue) {

        head = new Node();
        Node node = new Node();

        node.value = nodeValue;
        node.next = null;

        head = node;
        tail = node;
        size = 1;

        return head;
    }

    public void insertInLinkedList(int nodeValue, int location) {
        Node node = new Node();
        node.value = nodeValue;
        if (head == null) {
            createSingleLinkedList(nodeValue);
            return;
        } else if (location == 0) {
            node.next = head;
            head = node;
        } else if (location >= size) {
            node.next = null;
            tail.next = node;
            tail = node;
        } else {
            int index = 0;
            Node tempNode = head;

            while (index < location - 1) {
                tempNode.next = node;
                index++;
            }
            Node nextNode = tempNode.next;
            tempNode.next = node;
            node.next = nextNode;
        }
        size++;
    }

    public void traversingInSingleLinkedList() {

        if (head == null) {
            System.out.println("Single LinkedList doesn't exist");
        } else {
            Node tempNode = head;

            for (int i = 0; i < size; i++) {

                System.out.print(tempNode.value);

                if (i != size - 1) {
                    System.out.print(" -> ");

                }
                tempNode = tempNode.next;
            }
        }
        System.out.println();

    }

    public boolean searchingElementInSingleLinkedList(int nodeValue) {
        if (head != null) {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                if (tempNode.value == nodeValue) {
                    System.out.println(nodeValue + " found at location " + i);
                    return true;
                }
                tempNode = tempNode.next;
            }
        }

        System.out.println(nodeValue + "is not found in Single linked list");
        return false;
    }

    public void deleteNode(int location) {
        if (head == null) {
            System.out.println("Single LinkedList doesn't exist");
        } else if (location == 0) {
            head = head.next;

            if (size == 0) {
                tail = null;
            }
        } else if (location >= size) {
            Node tempNode = head;
            for (int i = 0; i < size - 1; i++) {
                tempNode = tempNode.next;
            }
            if (tempNode == head) {
                tail = head = null;
                size--;
                return;
            }
            tempNode.next = null;
            tail = tempNode;
            size--;

        } else {
            Node tempNode = head;
            for (int i = 0; i < location - 1; i++) {
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            size--;

        }
    }
}