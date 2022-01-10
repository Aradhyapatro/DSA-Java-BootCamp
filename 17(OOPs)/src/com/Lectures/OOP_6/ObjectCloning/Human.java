package com.Lectures.OOP_6.ObjectCloning;

public class Human implements Cloneable{
    int age;
    String name;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Human(Human h){
        this.name=h.name;
        this.age=h.age;
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
