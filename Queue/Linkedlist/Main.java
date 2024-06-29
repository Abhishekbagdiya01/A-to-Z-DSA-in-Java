class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.createQueue(12);
        queue.enQueue(12);
        queue.enQueue(121);
        queue.enQueue(122);
        queue.enQueue(123);
        queue.enQueue(124);
        queue.traversInQueue();
        System.out.println("--------------");
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        queue.deleteQueue();
        System.out.println(queue.isEmpty());

    }

}
