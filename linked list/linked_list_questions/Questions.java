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

    /*
     * Q4. Sum Lists
     * You have two numbers represented by a linked list, where each node contains a
     * single digit. The digits are stored in reverse order, such that the 1's digit
     * is at the head of the list. Write a function that adds the two numbers and
     * returns the sum as a linked list.
     */
    public LinkedList sumList(LinkedList l1, LinkedList l2) {
        Node n1 = l1.head;
        Node n2 = l2.head;
        int carry = 0;
        LinkedList resultLL = new LinkedList();
        while (n1 != null || n2 != null) {
            int result = carry;
            if (n1 != null) {
                result += n1.value;
                n1 = n1.next;
            }
            if (n2 != null) {
                result += n2.value;
                n2 = n2.next;
            }
            resultLL.insertInLL(result % 10);
            carry = result / 10;
        }
        return resultLL;
    }
}
