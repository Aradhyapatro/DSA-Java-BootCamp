package com.Lectures;

public class CLL_Implementation {
    public static void main(String[] args) {
        CLL t=new CLL();

        for (int i = 5; i >= 0; i--) {
            t.inseartAtHead(i);
        }

        t.display();
        t.inseartAtHead(-1);
        t.display();
        t.insertAtTail(6);
        t.display();
        t.insertAtIndex(100,58);
        t.display();
    }
}
