package com.Queue_Implementation;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws QueueException {
        CustomQueue<LinkedList<String>> q = new CustomQueue<>();

        LinkedList<String> s1 = new LinkedList<>();
        s1.add("arya");
        s1.add("Aradhya");
        s1.add("Aradhya Patro");
        s1.add("Vasudeva");
        s1.add("arya patro");
        LinkedList<String> s2 = new LinkedList<>();
        s2.add("Vrindavan");
        s2.add("Mathura");
        s2.add("Puri Dham");
        s2.add("Dwarka");
        s2.add("Ayodhya");
        s2.add("Mayapur");
        LinkedList<String> s3 = new LinkedList<>();
        s3.add("Hare Krishna");

        LinkedList<Integer> s4=new LinkedList<>();
        s4.add(1);
        s4.add(2);
        s4.add(3);

        q.add(s1);
        q.add(s2);
        q.add(s3);
//        q.add(s4);

        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());

    }
}
