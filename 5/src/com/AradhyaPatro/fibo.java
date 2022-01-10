package com.AradhyaPatro;

import java.util.Scanner;

public class fibo {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter the number upto which you want to find");
        int n=sc.nextInt();
        int c=1,a=0,b=1;
        while (c<=n)
        {
            int temp=a+b;
            System.out.print(a + " ");
            a=b;
            b=temp;
            c++;
        }
    }
}
