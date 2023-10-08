public class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        Questions q = new Questions();
        ll.createLL(1);
        ll.insertInLL(9);
        ll.insertInLL(5);
        ll.insertInLL(10);
        ll.insertInLL(2);

        ll.traversalInLL();
        q.removeDuplicates(ll);
        ll.traversalInLL();

        q.nthToLast(ll, 3);
        LinkedList l = q.partition(ll, 4);
        l.traversalInLL();
    }
}
