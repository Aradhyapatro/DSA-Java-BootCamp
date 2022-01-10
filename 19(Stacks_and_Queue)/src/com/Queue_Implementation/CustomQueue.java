package com.Queue_Implementation;

public class CustomQueue<E> {
    private int front;
    private int rear;
    private Object[] arr;
    private final int DEFAULTVAL=3;

    public CustomQueue() {
        front=-1;
        rear=-1;
        arr=new Object[DEFAULTVAL];
    }

    public void add(Object num){
        if(rear+1==arr.length){
            resize();
        }

        if(front==-1){
            front++;
        }

        arr[++rear]=num;
    }

    private void resize() {
        Object[] a=new Object[2*arr.length];

        for (int i = 0; i < arr.length; i++) {
            a[i]=arr[i];
        }

        arr=a;
        System.out.println("Resized to "+arr.length);
    }

    public Object remove() throws QueueException{

        if (front==-1 || front==rear+1){
            throw new QueueException("Aradhya's Order not to delete from Empty Queue");
        }

        if(front==rear){
            Object t=arr[front];
            front=-1;
            rear=-1;
            return t;
        }

        Object temp=arr[front];

        for (int i = front; i < rear; i++) {
            arr[i]=arr[i+1];
        }
        rear--;
        return temp;
    }

    public Object peek(){
        if(front==-1 || front >rear){
            System.out.println("Queue is empty");
            return null;
        }

        return arr[front];
    }
}
