package com.AradhyaPatro;

public class Fibbonacci {
    public static void main(String[] args) {
        System.out.println(fibo(40));
    }

    private static int fibo(int n) {
        if(n==0 || n==1){
            return n;
        }
        return (fibo(n-1)+fibo(n-2));
    }


}
