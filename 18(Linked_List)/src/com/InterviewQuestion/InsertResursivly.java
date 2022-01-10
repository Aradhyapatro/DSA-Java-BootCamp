package com.InterviewQuestion;

public class InsertResursivly {

    public static void main(String[] args) {
        LL h=new LL();
        h.insertAtTail(1);
        h.insertAtTail(2);
        h.insertAtTail(4);
        h.insertAtTail(5);
        h.insertAtTail(6);
        h.displayList();
        h.insertRecursion(3,3);
        h.displayList();

//        Node head=h.getHead();
//        head=recursiveInsert(head,10,null,2);
    }

//    private static Node recursiveInsert(Node head, int i, Node o, int i1) {
//    }
}
