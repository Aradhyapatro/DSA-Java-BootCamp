package com.AradhyaPatro;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the String");
        StringBuilder s=new StringBuilder();
        s=s.append(sc.nextLine());
        StringBuilder ss=new StringBuilder(s.reverse());
        s.reverse();
        System.out.println(s +" "+ss);
        if(s.equals(ss)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("NOT Palindrome");
        }

    }
}
