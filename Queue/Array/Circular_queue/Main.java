class Main{
    public static void main(String[] args) {
        
    CircularQueue circularQueue = new CircularQueue();
    circularQueue.createQueue(5);
    circularQueue.enQueue(12);
    circularQueue.enQueue(22);
    circularQueue.enQueue(42);
    circularQueue.enQueue(52);
   
   circularQueue.deQueue();
   circularQueue.enQueue(12);
   circularQueue.enQueue(72);
     circularQueue.deQueue();
   circularQueue.enQueue(1212); 
   circularQueue.traversalInQueue();

//    circularQueue.deleteQueue();

    }
}
