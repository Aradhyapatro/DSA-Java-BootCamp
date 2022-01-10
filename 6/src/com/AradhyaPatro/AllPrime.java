package com.AradhyaPatro;

import java.util.Scanner;

public class AllPrime {

  public static boolean prime(int n) {
    if (n == 2) return true;
    for (int i = 2; i < (n / 2); i++) {
      if (n % 2 == 0) return false;
    }
    return true;
  }

  public static void main(String[] args) {
    // main function
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the lower and upper boundaries");
    int l = sc.nextInt();
    int u = sc.nextInt();
    for (int i = l; i <= u; i++) {
      if (prime(i)) {
        System.out.print(i + " ");
      }
    }
  }
}
