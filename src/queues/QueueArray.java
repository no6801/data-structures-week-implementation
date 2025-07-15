package queues;

public class QueueArray {
    private int[] queue;
    private int front, rear, size;

    public QueueArray(int capacity) {
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(int value) {
        if (size == queue.length) {
            System.out.println("Queue Overflow");
            return;
        }
        rear = (rear + 1) % queue.length;
        queue[rear] = value;
        size++;
    }

    public int dequeue() {
        if (size == 0) {
            throw new IllegalStateException("Queue Underflow");
        }
        int value = queue[front];
        front = (front + 1) % queue.length;
        size--;
        return value;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int peek() {
        if (size == 0) throw new IllegalStateException("Queue is Empty");
        return queue[front];
    }
}
