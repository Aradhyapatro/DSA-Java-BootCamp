package com.Assignment;

import java.util.Scanner;
public class Sum {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int sum = 0;
    while (true) {
      int n = sc.nextInt();
      sum += n;
      System.out.println(sum);
      if (n == 0) break;
    }
  }
}
