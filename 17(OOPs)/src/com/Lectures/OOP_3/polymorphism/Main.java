package com.Lectures.OOP_3.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shape shape=new Shape();
        Shape square=new Square();
        Shape triangle=new Triangle();
        Shape circle= new Circle();

        circle.greeting();
        System.out.println(circle);
    }
}
