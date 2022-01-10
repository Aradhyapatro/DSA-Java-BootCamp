package com.Lectures.OOP_3.polymorphism.InheritancePoly;

public class boxweight extends box{
    int c;


    public boxweight(int a, int b,int c) {
        super(a, b);
        this.c=c;
    }

    public static void greet(){
        System.out.println("Child Class");
    }

    public static void main(String[] args) {
        box b=new boxweight(1,2,3);
        b.greet();
    }
}
