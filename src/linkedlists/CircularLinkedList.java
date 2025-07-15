package linkedlists;

public class CircularLinkedList {
    class Node {
        int data;
        Node next;

        Node(int value) {
            data = value;
            next = null;
        }
    }

    private Node tail;

    public void insert(int value) {
        Node newNode = new Node(value);
        if (tail == null) {
            tail = newNode;
            tail.next = tail;
        } else {
            newNode.next = tail.next;
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void printList() {
        if (tail == null) {
            System.out.println("List is empty");
            return;
        }
        Node current = tail.next;
        do {
            System.out.print(current.data + " -> ");
            current = current.next;
        } while (current != tail.next);
        System.out.println("(back to head)");
    }
}
