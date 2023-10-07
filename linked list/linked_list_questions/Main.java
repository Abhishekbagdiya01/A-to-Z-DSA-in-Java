public class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        Questions q = new Questions();
        ll.createLL(1);
        ll.insertInLL(2);
        ll.insertInLL(3);
        ll.insertInLL(4);
        ll.insertInLL(5);

        // System.out.println(ll.head.next.value);
        ll.traversalInLL();
        // q.removeDuplicates(ll);
        // ll.traversalInLL();

        q.nthToLast(ll, 3);

    }
}
