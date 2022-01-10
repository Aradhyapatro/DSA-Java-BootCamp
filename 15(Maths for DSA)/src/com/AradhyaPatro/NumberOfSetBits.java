package com.AradhyaPatro;

public class NumberOfSetBits {
    public static void main(String[] args) {
        int n=12345;
        System.out.println(Integer.toBinaryString(n));

        int c=0;
        while(n>0){
            c++;
            n-=(n&-n);
        }
        System.out.println(c);
    }
}
