package com.Lectures.OOP_6.ObjectCloning;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        Human a=new Human(20,"Aradhya");
        Human b=(Human)a.clone();
        System.out.println(b.age);
    }
}
