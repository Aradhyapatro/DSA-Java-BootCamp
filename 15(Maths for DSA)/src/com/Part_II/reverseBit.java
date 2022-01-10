package com.Part_II;

public class reverseBit {
    public static void main(String[] args) {
        int n=5;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(Integer.toBinaryString(Integer.MAX_VALUE-n)+" "+(Integer.MAX_VALUE-n));
    }
}
