package com.AradhyaPatro;

public class Pattern12 {
    public static void main(String[] args) {
        int n=5;
        for (int i = 1; i <= (2 * n); i++) {
            for (int j = 1; j <= (((2*n)-i)<n?((2*n)-i+1):i); j++) {
                System.out.print(" ");
            }
            for (int j = (((2*n)-i)<n?((2*n)-i+1):i); j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
