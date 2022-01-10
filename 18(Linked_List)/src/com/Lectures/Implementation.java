package com.Lectures;

public class Implementation {

    public static void main(String[] args) {
        LL h=new LL();h.display();
        for (int i = 1; i <= 5; i++) {
            h.insertTail(i);
        }
        h.insertHead(-1);
        h.insert(0,0);
        h.display();
        h.deleteAtHead();
        h.display();
        h.deleteAtTail();
        h.display();
        h.deleteAtIndex(1);
        h.display();
        System.out.println(h.Find(1)+1);
    }
}
