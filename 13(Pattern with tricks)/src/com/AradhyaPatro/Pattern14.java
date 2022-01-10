package com.AradhyaPatro;

public class Pattern14 {
    public static void main(String[] args) {
        int n=5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <=(2*(n-i)+1); j++) {
                if(i==1 || i==n || j==(2*(n-i)+1) || j==1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
