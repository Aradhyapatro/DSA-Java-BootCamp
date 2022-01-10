package com.AradhyaPatro;

public class Main {

    public static void main(String[] args) {
	// write your code here
        print1(5);
    }

    private static void print1(int i) {
        System.out.println(i);
        print2(i-1);
    }

    private static void print2(int n) {
        System.out.println(n);
        print3(n-1);
    }

    private static void print3(int i) {
        System.out.println(i);
        print4(i-1);
    }

    private static void print4(int i) {
        System.out.println(i);
        print5(i-1);
    }

    private static void print5(int i) {
        System.out.println(i);
    }


}
