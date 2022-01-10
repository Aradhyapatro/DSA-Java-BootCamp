package com.Lectures.OOP_3.Inheritance;

public class testing extends Box{

    int weight;
    public testing(int l, int b, int h,int weight) {
        super(l, b, h);
        this.weight=weight;
    }

    public testing() {

    }


    public static void main(String[] args) {
        Box b=new Box(12.3);
        System.out.println(b.b);
    }
}
