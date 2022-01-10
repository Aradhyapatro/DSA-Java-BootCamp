package com.AradhyaPatro;

public class Pattern23 {
    public static void main(String[] args) {
        int n=23;
        boolean b=true;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= (2*i)-1; j++) {
                if (j==1 || j==((2*i)-1)){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }

            for (int j = 2*(n-i)-1; j >= 1; j--) {
                System.out.print(" ");
            }

            for (int j = 1; j <= (2*i)-1; j++) {
                if (i==n && b==true){
                    b=false;
                    continue;
                }
                if ((j==1 || j==((2*i)-1 ))){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
}
