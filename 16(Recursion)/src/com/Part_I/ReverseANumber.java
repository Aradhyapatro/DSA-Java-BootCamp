package com.Part_I;

public class ReverseANumber {
    public static void main(String[] args) {
        int n=123494321;
        int m=Reverse(n);
        if(n==m){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }

    private static int Reverse(int n) {
        if(n/10==0){
            return n;
        }

        int m=(int)(Math.log10(n))+1;
        return (int) (((n%10)*Math.pow(10,m-1))+Reverse(n/10));
    }
}
