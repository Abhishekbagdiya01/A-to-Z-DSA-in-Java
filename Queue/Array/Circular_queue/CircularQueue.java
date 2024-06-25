public class CircularQueue {
    int[] queue;
    int topOfQueue;
    int startOfQueue;
    int size;

    public void createQueue(int size) {
        queue = new int[size];
        this.size = size;
        System.out.println("Circular queue is created");
        topOfQueue = -1;
        startOfQueue = -1;
    }

    public void traversalInQueue() {
        for (int i : queue) {
            System.out.println(i);
        }
    }

    public boolean isEmpty() {
        if (topOfQueue == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (startOfQueue == topOfQueue + 1) {
            return true;
        } else if (startOfQueue == 0 && topOfQueue + 1 == size) {
            return true;
        } else {
            return false;
        }
    }

    public void enQueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else if (isEmpty()) {
            startOfQueue = 0;
            topOfQueue++;
            queue[topOfQueue] = value;
            System.out.println("Value " + value + " inserted sucessfully");
        } else {
            if (topOfQueue + 1 == size) {
                topOfQueue = 0;
            } else {
                topOfQueue++;
            }
            queue[topOfQueue] = value;
            System.out.println("Value " + value + " inserted sucessfully");

        }
    }

    public void deQueue() {
        if (isEmpty()) {
            System.out.println("Circular queue is empty");
        } else {

            int result = queue[startOfQueue];
            System.out.println(result + " is removed");
            queue[startOfQueue] = 0;
            if (startOfQueue == topOfQueue) {
                startOfQueue = topOfQueue = -1;
            } else if (startOfQueue + 1 == size) {
                startOfQueue = 0;
            } else {
                startOfQueue++;
            }
        }
    }
    public void deleteQueue(){
        queue = null;
        startOfQueue = -1;
        topOfQueue = -1;
        size = -1;
        System.out.println("Queue is deleted");}
}