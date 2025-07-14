package stacks;

public class StackArray {
    private int[] stack;
    private int top;

    public StackArray(int capacity) {
        stack = new int[capacity];
        top = -1;
    }

    public void push(int value) {
        if (top == stack.length - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top] = value;
    }

    public int pop() {
        if (top == -1) throw new IllegalStateException("Stack Underflow");
        return stack[top--];
    }

    public int peek() {
        if (top == -1) throw new IllegalStateException("Stack is Empty");
        return stack[top];
    }
}
