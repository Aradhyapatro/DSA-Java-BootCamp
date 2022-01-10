package com.Lectures.OOP_4.pack;

import com.Lectures.OOP_4.A;

public class test extends A {
    public test(int num, String s) {
        super(num, s);
    }

    public static void main(String[] args) {
        test a=new test(10,"arya");
//        System.out.println(a.s);
    }
}
