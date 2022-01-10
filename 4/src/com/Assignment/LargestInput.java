package com.Assignment;

import java.util.Scanner;

public class LargestInput {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = 0;
    while (true) {
      int m = sc.nextInt();
      if (m > n) n = m;
      System.out.println(n);
      if (m == 0) break;
    }
  }
}
