package com.CustomImplimentation_Stack;

public class Stack<E> {
    static final int DEFAULTVAL = 5;
    protected Object[] data;
    protected int index;

    public Stack(Object[] data) {
        this.data = data;
    }

    public Stack() {
        index = -1;
        data = new Object[DEFAULTVAL];
    }

    public void push(Object ele) {
        ++index;
        if (index == data.length ) {
            data = resize();
        }
        data[index] = ele;
    }

    private Object[] resize() {
        Object[] temp = new Object[2 * data.length];

        for (int j = 0; j < data.length; j++) {
            temp[j] = data[j];
        }
        System.out.println("resized to "+temp.length);
        return temp;
    }

    public Object pop() throws StackException {
        if(index==-1){
            throw new StackException("Cannot delete from Empty Stack Ordered By Aradhya");
        }

        index--;
        return data[index + 1];
    }

    public Object peek() {
        return data;
    }
}
