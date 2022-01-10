package com.Assignment;

import java.util.Scanner;

public class Currency {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the money in Rupees\n");
    int n = sc.nextInt();
    System.out.println("The money in dollars is : " + (n / 78.0));
  }
}
