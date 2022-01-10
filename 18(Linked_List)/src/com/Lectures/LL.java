package com.Lectures;

public class LL {
    private Node head;
    private Node tail;
    public int size;

    public LL() {
        this.size = 0;
    }

    class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public Node getIndex(int index){
        Node temp=head;
        while(index>0){
            temp=temp.next;
            index--;
        }
        return temp;
    }

    public void insert(int val,int index){
        if(index==-1){
            insertHead(val);
            return;
        }

        if (index==size){
            insertTail(val);
            return;
        }

        if(index>size){
            System.out.println("You have entered too big a value for index");
            return;
        }
        size++;
        Node temp=new Node(val);
        Node t=getIndex(index);
        temp.next=t.next;
        t.next=temp;
    }

    public void insertHead(int val){
        Node temp=new Node(val);
        temp.next=head;
        head=temp;
        size++;

        if(tail==null){
            tail=head;
        }
    }

    public void insertTail(int val){
        Node temp=new Node(val);
        size++;
        if(head==tail && tail==null){
            head=temp;
            tail=temp;
            return;
        }
        tail.next=temp;
        tail=temp;
    }

    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.printf("%d -> ",temp.data);
            temp=temp.next;
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
    }

    public void deleteAtTail(){
        Node temp=head;

        if(tail==null){
            System.out.println("Linked List is empty");
            return;
        }
        size--;
        while(temp.next!=tail){
            temp=temp.next;
        }

        tail=temp;
        tail.next=null;
    }

    public void deleteAtIndex(int index){
        Node t=getIndex(index);
        t.next=t.next.next;
        size--;
    }

    public int Find(int val){
        Node temp=head;
        int c=-1;
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

