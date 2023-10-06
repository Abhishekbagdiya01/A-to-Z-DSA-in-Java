import java.util.HashSet;

public class Questions {

    /*
     * Q1
     * Remove Duplicates
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
}
