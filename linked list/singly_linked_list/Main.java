public class Main {
    public static void main(String[] args) {
        SingleLinkedList sll = new SingleLinkedList();
        sll.createSingleLinkedList(2);
        sll.insertInLinkedList(4, 1);
        sll.insertInLinkedList(8, 0);
        sll.insertInLinkedList(82, 3);

        sll.insertInLinkedList(80, 5);
        sll.traversingInSingleLinkedList();
        sll.deleteNode(3);

        sll.traversingInSingleLinkedList();
        sll.searchingElementInSingleLinkedList(4);
        sll.deleteSLL();
        sll.traversingInSingleLinkedList();
    }

}
