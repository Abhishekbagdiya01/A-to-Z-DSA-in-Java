public class Queue {
    LinkedList ll = new LinkedList();

    public void createQueue(int value) {
        Node result = ll.createSingleLinkedList(value);
        System.out.println("Queue is created with inserted value " + result.value);
    }

    public boolean isEmpty() {
        if (ll.head == null) {
            return true;
        } else {
            return false;
        }
    }

    public void enQueue(int value) {
        ll.insertInLinkedList(value, ll.size);
    }

    public int deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        } else {
           int value =  ll.head.value;
           System.out.println(value + " is deleted from Queue");
            ll.deleteNode(0);
            return value;

        }
    }

    public void traversInQueue() {
        ll.traversingInSingleLinkedList();
    }

    public void deleteQueue() {
        ll.deleteSLL();
        System.out.println("Queue deleted successfuly");
    }
}
