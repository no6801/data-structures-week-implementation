package linkedlists;

public class SinglyLinkedList {
    class Node {
        int data;
        Node next;

        Node(int value) {
            data = value;
            next = null;
        }
    }

    private Node head;

    public void insertAtHead(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
