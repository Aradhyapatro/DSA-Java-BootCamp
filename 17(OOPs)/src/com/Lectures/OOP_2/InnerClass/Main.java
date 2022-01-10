package com.Lectures.OOP_2.InnerClass;

public class Main {
    static class inner{
        int a;

        public inner(int a) {
            this.a = a;
            System.out.println(this.a);
        }
    }

    public static void main(String[] args) {
        inner n=new inner(30);
    }
}
