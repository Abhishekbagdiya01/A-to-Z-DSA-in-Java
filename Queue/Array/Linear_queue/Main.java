public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.createQueue(5);
        System.out.println(queue.isEmpty());
        queue.enQueue(12);
        queue.enQueue(1212);
        queue.enQueue(54345);

        queue.traversalInQueue();
        queue.deQueue();
        queue.deQueue();
        System.out.println("--------------------------------");
     
        // queue.deleteQueue();
        queue.traversalInQueue();
    }
}
