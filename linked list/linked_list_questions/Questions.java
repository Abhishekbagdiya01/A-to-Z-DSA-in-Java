import java.util.HashSet;

public class Questions {

    /*
     * Q1. Remove Duplicates
     * Write a method to remove duplicates from an unsorted linked list.
     */

    public void removeDuplicates(LinkedList ll) {
        HashSet<Integer> hashSet = new HashSet<Integer>();
        Node currentNode = ll.head;
        Node prevNode = null;
        while (currentNode != null) {
            if (hashSet.contains(currentNode.value)) {
                prevNode.next = currentNode.next;
                ll.size--;
            } else {
                hashSet.add(currentNode.value);
                prevNode = currentNode;
            }
            currentNode = currentNode.next;
        }
    }

    /*
     * Q2. Return Nth to Last
     * Implement and algorithm to find the nth to last element of a singly linked
     * list.
     */
    public void nthToLast(LinkedList ll, int n) {
        Node tempNode = ll.head;
        if (n <= ll.size) {
            for (int i = 0; i < ll.size - n; i++) {
                tempNode = tempNode.next;
            }
            System.out.println(tempNode.value);
        } else {
            System.out.println("IndexOutOfBoundsException");
        }
    }

    /*
     * Q3. Partition
     * Write code to partition a linked list around a value x, such that all nodes
     * less than x come before all nodes greater than or equal to x
     */
    public LinkedList partition(LinkedList ll, int x) {
        Node currentNode = ll.head;
        ll.tail = currentNode;
        while (currentNode != null) {
            Node next = currentNode.next;
            if (currentNode.value < x) {
                currentNode.next = ll.head;
                ll.head = currentNode;
            } else {
                ll.tail.next = currentNode;
                ll.tail = currentNode;
            }
            currentNode = next;
        }
        ll.tail.next = null;
        return ll;
    }
}
