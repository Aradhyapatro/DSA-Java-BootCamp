package com.CircularQueue_Implimentation;

public class Main {
    public static void main(String[] args) {
        CircularQueue<Integer> s=new CircularQueue<>();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);
        s.add(5);
        s.add(6);

        System.out.println(s.remove());
        System.out.println(s.remove());
        System.out.println(s.remove());
        System.out.println(s.remove());
        System.out.println(s.remove());
        System.out.println(s.remove());
        System.out.println(s.remove());

    }
}
