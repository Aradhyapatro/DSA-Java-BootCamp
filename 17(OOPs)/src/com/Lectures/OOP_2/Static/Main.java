package com.Lectures.OOP_2.Static;

public class Main {
    static int a=4;
    static int b;

    static {
        System.out.println("Static Block");
        b=a*5;
    }

    public static void main(String[] args) {
        Main obj=new Main();
        System.out.println(obj.a+" "+obj.b);

        
    }
}
