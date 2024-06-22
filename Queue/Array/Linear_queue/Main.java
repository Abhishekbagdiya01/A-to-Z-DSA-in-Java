public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.createQueue(5);
        System.out.println(queue.isEmpty());
        queue.push(12);
        queue.push(1212);
        queue.push(54345);

        queue.traversalInQueue();
        queue.pop();
        queue.pop();
        System.out.println("--------------------------------");
     
        // queue.deleteQueue();
        queue.traversalInQueue();
    }
}
