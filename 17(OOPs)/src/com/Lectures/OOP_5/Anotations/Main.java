package com.Lectures.OOP_5.Anotations;

public class Main implements A{

    @Override
    public void greet() {
        System.out.println("I am happy");
    }

    public static void main(String[] args) {
        Main m=new Main();
        m.greet();
    }
}
