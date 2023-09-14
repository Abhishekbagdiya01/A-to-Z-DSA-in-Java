public class Main {
    public static void main(String[] args) {
        SingleLinkedList sll = new SingleLinkedList();

        sll.insertElement(34, 1);
        System.out.println(sll.head.value);
        sll.insertElement(334, 3);
        System.out.println(sll.head.next.value);

    }
}
