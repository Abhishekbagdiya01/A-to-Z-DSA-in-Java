public class Queue {
    int[] queueArray;
    int topOfQueue;
    int startOfQueue;

    public void createQueue(int size) {
        queueArray = new int[size];
        topOfQueue = -1;
        startOfQueue = 0;
        System.out.println("Linear queue is created");
    }

    public boolean isEmpty() {
        if (topOfQueue == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void enQueue(int value) {
        if (topOfQueue == queueArray.length - 1) {
            System.out.println("Queue is full");
        } else {
            queueArray[topOfQueue + 1] = value;
            System.out.println(value + " is Inserted successfully");
            topOfQueue++;
        }
    }

    public void deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            queueArray[startOfQueue] = 0;
            startOfQueue++;
            System.out.println("Value is dequeued");
        }
    }

    public void traversalInQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            for (int i : queueArray) {
                System.out.println(i);
            }

        }
    }

    public void deleteQueue() {
        queueArray = null;
        topOfQueue = -1;
    }
}