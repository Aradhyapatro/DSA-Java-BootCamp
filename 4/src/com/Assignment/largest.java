package com.Assignment;

import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the first number");
        int n1=sc.nextInt();
        System.out.println("Enter the Second number");
        int n2=sc.nextInt();
        if(n1>n2)
            System.out.println("THe greater number : "+n1);
        else
            System.out.println("THe greater number : "+n2);

    }
}
