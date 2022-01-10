package com.AradhyaPatro;

public class NumberOfDigits {
    public static void main(String[] args) {
        int n=12;
        int base=2;

        int v = (int)(Math.log(n) / Math.log(base)) + 1;
        System.out.println(v);
    }
}
