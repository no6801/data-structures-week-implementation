package linkedlists;

public class DoublyLinkedList {
    class Node {
        int data;
        Node prev, next;

        Node(int value) {
            data = value;
        }
    }

    private Node head, tail;

    public void insertAtEnd(int value) {
        Node newNode = new Node(value);
        if (tail == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    public void printForward() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public void printBackward() {
        Node current = tail;
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.prev;
        }
        System.out.println("null");
    }
}
