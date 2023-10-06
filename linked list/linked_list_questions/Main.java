public class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        Questions q = new Questions();
        ll.createLL(5);
        ll.insertInLL(10);
        ll.insertInLL(15);
        ll.insertInLL(10);
        ll.insertInLL(15);

        // System.out.println(ll.head.next.value);
        ll.traversalInLL();
        q.removeDuplicates(ll);
        ll.traversalInLL();

    }
}
