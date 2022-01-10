package com.Lectures.OOP_3.polymorphism;

public class Circle extends Shape {
    public int a=9;

    @Override
    void area() {
        System.out.println("Pie * r * r");
    }
}
