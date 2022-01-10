package com.AradhyaPatro;

public class Pattern15 {
    public static void main(String[] args) {
        int n=5;
        for (int i=1;i<=(2*n-1);i++){
            for (int j = 1; j <= Math.abs(n-i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= Math.abs(i>n?2*n-i:i); j++) {
                if (j==1 || j==Math.abs(i>n?2*n-i:i)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
