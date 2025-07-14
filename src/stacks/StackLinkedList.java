package stacks;

class Node {
    int data;
    Node next;

    Node(int value) {
        data = value;
        next = null;
    }
}

public class StackLinkedList {
    private Node top;

    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
    }

    public int pop() {
        if (top == null) throw new IllegalStateException("Stack Underflow");
        int value = top.data;
        top = top.next;
        return value;
    }

    public int peek() {
        if (top == null) throw new IllegalStateException("Stack is Empty");
        return top.data;
    }
}
