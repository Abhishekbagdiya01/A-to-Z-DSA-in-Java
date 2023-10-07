import java.util.HashSet;

public class Questions {

    /*
     * Q1. Remove Duplicates
     * Write a method to remove duplicates from an unsorted linked list.
     */

    public void removeDuplicates(LinkedList ll) {
        HashSet<Integer> hashSet = new HashSet();
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
}
