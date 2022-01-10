package com.EASY;

public class CountNumberOfBits {
    public static void main(String[] args) {
        int n=111111101;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(count(n));
    }

    private static int count(int n) {
        int c=0;
        for (int i = 1; i <= 32; i++) {
            if((n&1)==1){
                c++;
            }
            n=n>>1;
        }
        return c;
    }
}
