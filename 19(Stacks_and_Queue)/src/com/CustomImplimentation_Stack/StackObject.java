package com.CustomImplimentation_Stack;

import java.util.ArrayList;

public class StackObject {
    public static void main(String[] args) throws StackException {
        Stack<ArrayList<Integer>> s=new Stack<>();
        ArrayList<Integer> a=new ArrayList<>(5);
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        ArrayList<Integer> b=new ArrayList<>(5);
        b.add(6);
        b.add(7);
        b.add(8);
        b.add(9);
        b.add(10);
        ArrayList<Integer> c=new ArrayList<>(5);
        c.add(11);
        c.add(12);
        c.add(13);
        c.add(14);
        c.add(15);
        s.push(a);
        s.push(b);
        s.push(c);
        System.out.println(s.pop());
    }
}
