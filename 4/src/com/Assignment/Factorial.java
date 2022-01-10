package com.Assignment;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int p=1;
        for (int i = 2; i <= n; i++) {
            p*=i;
        }
        System.out.println("The factorial is " + p);
    }
}
