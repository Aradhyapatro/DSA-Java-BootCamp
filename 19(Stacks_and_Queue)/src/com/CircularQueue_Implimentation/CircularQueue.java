package com.CircularQueue_Implimentation;

public class CircularQueue<E> {
    private int front;
    private int rear;
    static final int DefaultVal=5;
    private Object[] arr;

    public CircularQueue() {
        this.front = -1;
        this.rear = 0;
        arr=new Object[DefaultVal];
    }

    public void add(Object num){
        if(front==rear){
            resize(num);
            return;
        }

        if(front==-1){
            front=0;
        }

        arr[rear]=num;
        rear=(rear+1)%arr.length;

        System.out.println("*");
    }

    private void resize(Object num) {
        Object[] temp=new Object[2*arr.length];

        for (int i = 0; i < arr.length; i++) {
            temp[i]=arr[(front+i)% arr.length];
        }

        front=0;
        rear=arr.length;

        temp[rear]=num;
        rear=(rear+1)%temp.length;

        arr=temp;

        System.out.println("Resized to "+arr.length);
    }

    public Object remove(){
        if(front==rear){
            System.out.println("Empty Queue");
            return null;
        }

        int t=front;
        front=(front+1)%arr.length;
        return arr[t];
    }

    public Object peek(){
        if(front==-1){
            System.out.println("Queue is Empty");
            return null;
        }
        System.out.println(front+" "+rear);
        return arr[front];
    }
}
