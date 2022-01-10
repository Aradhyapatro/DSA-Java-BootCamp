package com.AradhyaPatro;

public class Pattern5 {
    public static void main(String[] args) {
        int n=5;
        int c=0;
        for (int i = 1; i <= (2*n-1); i++) {
            if(i<=n){
                c++;
            }
            else{
                c--;
            }
            for (int j = 1; j <= c; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
