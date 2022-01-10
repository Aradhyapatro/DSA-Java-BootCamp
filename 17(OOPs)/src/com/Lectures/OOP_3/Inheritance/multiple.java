package com.Lectures.OOP_3.Inheritance;

public class multiple extends testing{
    int cost;

    public multiple(int l, int b, int h, int weight, int cost) {
        super(l, b, h, weight);
        this.cost = cost;
    }

    public multiple(int cost) {
        super();
        this.cost = cost;
    }

    public static void main(String[] args) {
        multiple m=new multiple(10);
        System.out.println(m.weight);
    }
}
