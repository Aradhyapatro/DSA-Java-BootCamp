package com.Part_I;

public class fact {
    public static void main(String[] args) {
        int n=30;
        System.out.println(factorial(n));
    }

    private static int factorial(int n) {
        if(n==1 || n==0){
            return 1;
        }
        return n*factorial(n-1);
    }
}
