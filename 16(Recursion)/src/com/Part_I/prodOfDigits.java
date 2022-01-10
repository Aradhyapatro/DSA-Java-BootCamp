package com.Part_I;

public class prodOfDigits {
    public static void main(String[] args) {
        int n=3524;
        System.out.println(prod(n));
    }

    private static int prod(int n) {
        if(n/10==0){
            return n;
        }

        return (n%10)*prod(n/10);
    }
}
