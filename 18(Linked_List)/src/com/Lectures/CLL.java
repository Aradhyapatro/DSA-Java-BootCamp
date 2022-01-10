package com.Lectures;

public class CLL {
    private Node head;
    private Node tail;
    int size;

    public class Node{
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next=this;
        }
    }

    public void inseartAtHead(int val){
        size++;
        Node temp=new Node(val);
        if(head==null){
            head=temp;
            tail=temp;
            return;
        }

        temp.next=head;
        tail.next=temp;
        head=temp;
    }

    public void insertAtTail(int val){
        size++;
        Node temp=new Node(val);
        if(tail==null){
            head=temp;
            tail=temp;
            return;
        }

        tail.next=temp;
        temp.next=head;
        tail=temp;
    }

    public void insertAtIndex(int val,int index){
        if(index==-1){
            inseartAtHead(val);
        }

        if(index==size){
            insertAtTail(val);
        }

        Node t=getIndex(index);
        Node temp=new Node(val);

        temp.next=t.next;
        t.next=temp;
    }

    private Node getIndex(int index) {
        Node temp=head;
        while(index>0){
            temp=temp.next;
            index--;
        }
        return temp;
    }

    public void deleteAtHead(){
        if(head==null){
            System.out.println("CLL is empty");
            return;
        }

        size--;

        if(head==head.next){
            head=null;
            tail=null;
            return;
        }

        head=head.next;
        tail.next=head;
    }

    public void display(){
        Node temp=head;
        do {
            System.out.printf("%d -> ",temp.data);
            temp=temp.next;
        }while (temp!=head);
        System.out.println("null");
    }
}
