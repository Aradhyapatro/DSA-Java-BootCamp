package com.Lectures;

public class DLL {

    private Node head;
    private Node tail;
    int size;

    public DLL(){
        this.size=0;
    }

    public class Node{
        private int data;
        private Node next;
        private Node prev;

        public Node(int data, Node next, Node prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }

        public Node(int data){
            this.data=data;
        }
    }

    public void insertAtHead(int val){
        size++;
        Node temp=new Node(val);
        if(head==null){
            head=temp;
            tail=temp;
            return;
        }

        temp.prev=null;
        temp.next=head;
        head.prev=temp;
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

        temp.prev=tail;
        tail.next=temp;
        tail=temp;
    }

    public Node getIndex(int index){
        Node t=head;
        for (int i = 0; i < index; i++) {
            t=t.next;
        }
        return t;
    }

    public void insertAtIndex(int val,int index){
        if(index==-1){
            insertAtHead(val);
            return;        }

        if(index==size){
            insertAtTail(val);
            return;
        }

        if(index>size){
            System.out.println("You entered a too big number");
            return;
        }

        Node temp=new Node(val);
        Node t=getIndex(index);
        temp.prev=t.prev;
        temp.next=t;
        t.prev.next=temp;
        t.prev=temp;

    }

    public void displayFromHead(){
        Node temp=head;
        while(temp!=null){
            System.out.printf("%d -> ",temp.data);
            temp=temp.next;
        }
        System.out.println("null");
    }

    public void displayFromTail(){
        Node temp=tail;
        while(temp!=null){
            System.out.printf("%d -> ",temp.data);
            temp=temp.prev;
        }
        System.out.println("null");
    }

    public void deleteAtHead(){
        if(head==null){
            System.out.println("Linked List is empty");
            return;
        }
        size--;
        head=head.next;
        head.prev=null;
    }

    public void deleteAtTail(){
        if(tail==null){
            System.out.println("Linked List is empty");
            return;
        }
        size--;
        tail=tail.prev;
        tail.next=null;
    }

    public void deleteAtIndex(int index){
        Node t=getIndex(index);

        t.next.prev=t.prev;
        t.prev.next=t.next;
        size--;
    }

    public int Find(int val){
        int c=-1;
        Node temp=head;
        while(temp!=null){
            c++;
            if(temp.data==val){
                return c;
            }
            temp=temp.next;
        }
        return -1;
    }
}
