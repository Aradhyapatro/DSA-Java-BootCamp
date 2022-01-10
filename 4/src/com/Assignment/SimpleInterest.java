package com.Assignment;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Principal,interest,and Time");
        int p=sc.nextInt();
        int t=sc.nextInt();
        float r=sc.nextFloat();
        System.out.println("The Simple interest is : "+((p*r*t)/100.0));
    }
}
