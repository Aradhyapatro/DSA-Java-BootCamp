package com.Lectures.OOP_4;

public class Main extends A{
    public Main(int num, String s) {
        super(num, s);
    }

    public static void main(String[] args) {
        Main m=new Main(10,"arya");
        System.out.println(m.s);
    }
}
