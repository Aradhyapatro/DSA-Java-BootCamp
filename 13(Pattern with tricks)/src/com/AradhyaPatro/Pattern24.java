package com.AradhyaPatro;

public class Pattern24 {
    public static void main(String[] args) {
        int n=50;
        for (int i = 1; i <= (2*n); i++) {
            for (int j = 1; j <= ((i<=n)?i:2*n-i+1); j++) {
                if(j==1 || j==i || j==(2*n-i+1)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }

            for (int j = 1; j <=((i<=n)?((2*n)-(2*i)):(2*i)-(2*n)-2); j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <=((i<=n)?i:(2*n)-i+1); j++) {
                if(j==1 || j==i || j==((2*n)-i+1)){
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
