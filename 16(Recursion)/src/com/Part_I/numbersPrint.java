package com.Part_I;

public class numbersPrint {
    public static void main(String[] args) {
        int n=10;
        print1toN(n);
        System.out.println();
        printNto1(n);
    }

    private static void print1toN(int n) {
        if(n==0){
            return;
        }

        print1toN(n-1);
        System.out.print(n+" ");
    }

    private static void printNto1(int n) {
        if(n==0){
            return;
        }

        System.out.print(n+" ");
        printNto1(n-1);
    }
}
