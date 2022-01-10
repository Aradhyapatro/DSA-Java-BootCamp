package com.RecursionPattern;

/*
    *****
    ****
    ***
    **
    *
 */

public class Pattern1 {
    public static void main(String[] args) {
        pat(5);
    }

    private static void pat(int n) {
        if(n==0){
            return;
        }

        print(n);
        System.out.println();
        pat(n-1);
    }

    private static void print(int n) {
        if(n==0){
            return;
        }
        System.out.print("*");
        print(n-1);
    }


}
