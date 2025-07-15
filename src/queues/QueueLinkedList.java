package queues;

class Node {
    int data;
    Node next;

    Node(int value) {
        data = value;
        next = null;
    }
}

public class QueueLinkedList {
    private Node front, rear;

    public void enqueue(int value) {
        Node newNode = new Node(value);
        if (rear != null) {
            rear.next = newNode;
        }
        rear = newNode;
        if (front == null) {
            front = newNode;
        }
    }

    public int dequeue() {
        if (front == null) {
            throw new IllegalStateException("Queue Underflow");
        }
        int value = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        return value;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public int peek() {
        if (front == null) throw new IllegalStateException("Queue is Empty");
        return front.data;
    }
}
