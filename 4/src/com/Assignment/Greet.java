package com.Assignment;

import java.util.Scanner;

public class Greet {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your name");
        String s=sc.next();
        System.out.println("Namaste "+s);
    }
}
