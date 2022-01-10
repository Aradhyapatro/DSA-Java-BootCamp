package com.Lectures;

public class DLL_Implementation {
    public static void main(String[] args) {
        DLL h=new DLL();
        for (int i = 1; i <=5; i++) {
            h.insertAtTail(i);
        }
        h.insertAtIndex(100,2);
        h.displayFromHead();
        h.displayFromTail();
        System.out.println(h.Find(100));
        h.displayFromHead();
        h.deleteAtHead();
        h.displayFromHead();
        h.deleteAtTail();
        h.displayFromHead();
        h.deleteAtIndex(1);
        h.displayFromHead();
    }
}
