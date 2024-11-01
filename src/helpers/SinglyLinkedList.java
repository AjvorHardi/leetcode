package helpers;

public class SinglyLinkedList {
    public Node head; // head of list

    public SinglyLinkedList() {
        head = null;
    }

    public SinglyLinkedList(Node head) {
        this.head = head;
    }

    public SinglyLinkedList(int val) {
        Node head = new Node(val);
    }

    public void append(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        return;
    }

    public void append(Node newNode) {
        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        return;
    }

    public void prepend(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
    }

    public void delete(int val) {
        if (head == null) return;  // Empty list, nothing to delete

        if (head.val == val) {
            head = head.next;
            return;
        }

        //important, so we can move freely through the list, without changing the head
        Node current = head;

        while (current.next != null) {
            if (current.next.val == val) {
                current.next = current.next.next;
                break;
            } else {
                current = current.next;
            }
        }
    }

    public void printList() {
        if (head == null) System.out.println("the list is empty");

        Node current = head;
        while (current != null) {
            System.out.println(current.val + " -> ");
            current = current.next;
        }
    }

    public Node reverse() {
        Node prev = null;
        Node current = this.head;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        this.head = prev;
        return this.head;
    }

}