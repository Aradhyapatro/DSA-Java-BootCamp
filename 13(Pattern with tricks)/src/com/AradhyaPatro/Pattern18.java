package com.AradhyaPatro;

public class Pattern18 {
    public static void main(String[] args) {
        int n=62;
        for (int i = 1; i <= (2*n); i++) {
            int k=(i<=n)?i-1:(2*n)-i;
            k=2*k;
            int m=(2*n)-k;
            m=m/2;
            for (int j = 1; j <= m; j++) {
                System.out.print("*");
            }

            for (int j = 1; j <=k; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= m; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
