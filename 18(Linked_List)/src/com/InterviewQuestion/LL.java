package com.InterviewQuestion;

public class LL {
    private Node head;
    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertAtHead(int val) {
        Node temp = new Node(val);
        if (head == null) {
            head = temp;
            return;
        }

        temp.next = head;
        head = temp;
        size++;
    }

    public void insertAtTail(int val) {
        Node temp = new Node(val);

        if (head == null) {
            head = temp;
            return;
        }

        Node t = head;
        while (t.next != null) {
            t = t.next;
        }
        t.next = temp;
        size++;
    }

    public void insertAtIndex(int val, int index) {
        Node temp = new Node(val);
        Node t = head;

        if (head == null) {
            temp = head;
            return;
        }

        if (index > size) {
            index = index % size;
        }

        if (index == 1) {
            insertAtHead(val);
        }

        if (index == size) {
            insertAtTail(val);
        }

        index = index - 1;
        while (index != 0) {
            index--;
            t = t.next;
        }
        temp.next = t.next;
        t.next = temp;
    }

    public void displayList() {
        Node h = head;
        while (h != null) {
            System.out.print(h.data + " -> ");
            h = h.next;
        }
        System.out.println("null");
    }

    public void insertRecursion(int val, int index) {
        head = insertRec(val, index, head);
    }

    private Node insertRec(int val, int index, Node node) {
        if (index == 1 || index == 0) {
            Node temp = new Node(val);
            temp.next = node;
            size++;
            return temp;
        }

        node.next = insertRec(val, --index, node.next);
        return node;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }
}
