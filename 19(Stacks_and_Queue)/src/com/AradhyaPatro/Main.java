package com.AradhyaPatro;

import com.sun.source.tree.Tree;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Stack<Float> f = new Stack<Float>();
        f.push(10.3f);
        f.push(10f);
        f.push(100f);
        f.push(10000f);
        System.out.println(f.pop());
        System.out.println(f.peek());
        System.out.println(f.pop());
        System.out.println(f.peek());
        System.out.println(f.pop());
        System.out.println(f.peek());

//        Queue in Java is implemented as a interface
        Queue<Integer> q=new LinkedList<>();
        q.add(10);
        q.add(20);
        System.out.println(q.remove());

        Deque<Integer> dq=new ArrayDeque<>();
    }
}
