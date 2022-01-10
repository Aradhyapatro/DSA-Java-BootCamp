package com.AradhyaPatro;

import java.util.Scanner;

public class SumOfNNumbers {

  public static int sum(int n) {
    int sum = 0;
    for (int i = 1; i <= n; i++) {
      sum += i;
    }
    return sum;
  }

  public static void main(String[] args) {
    // main function
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int n = sc.nextInt();
    System.out.println(sum(n));
    sc.close();
  }
}
