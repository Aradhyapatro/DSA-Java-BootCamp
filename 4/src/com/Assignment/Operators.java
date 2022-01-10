package com.Assignment;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number");
        int n1=sc.nextInt();
        System.out.println("Enter the Second number");
        int n2=sc.nextInt();
        System.out.println("Enter the operation");
        char c=sc.next().charAt(0);
        if(c=='+')
            System.out.println("Addition is : "+ (n1+n2));
        else if(c=='-')
            System.out.println("Substraction is : "+(n1-n2));
        else if(c=='*')
            System.out.println("Product is : "+ (n1*n2));
        else if(c=='/')
            System.out.println("Qoutient is : "+ (n1/n2));
        else
            System.out.println("Invalid oparator");
    }
}
