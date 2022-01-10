package com.Lectures.OOP_5.Anotations;

public interface A {
    default void greet(){
        System.out.println("I am grood");
    }
}
