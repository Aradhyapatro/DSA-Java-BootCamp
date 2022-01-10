package com.Lectures.OOP_6.ArrayList;

import java.util.Arrays;

public class CustomArrayList<T extends Number> {
    private Object[] data;
    final static int DEFAULT_SIZE = 10;
    private int size = -1;

    public CustomArrayList() {
        data = new Object[DEFAULT_SIZE];
    }

    public void add(T val) {
        if (IsFull()) {
            data=resize();
        }

        data[++size] = val;
    }

    public Object get(int index) {
        return data[index];
    }

    public void set(int index, T val) {
        data[index] = val;
    }

    public void remove() {
        size--;
    }

    private Object[] resize() {
        Object[] temp = new Object[2 * data.length];

        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        return temp;
    }

    private boolean IsFull() {
        return size == data.length;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" + "data=" + Arrays.toString(data) + ", size=" + size + '}';
    }

    public static void main(String[] args) {
        CustomArrayList<Integer> arr = new CustomArrayList();
        arr.add(123);
        System.out.println(arr);


//        ArrayList<Integer> a=new ArrayList<>();
    }
}
