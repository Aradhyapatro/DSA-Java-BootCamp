package com.AradhyaPatro;

import java.util.Scanner;

public class pythagorean {

  public static boolean check(int a, int b, int c) {
    if ((a * a + b * b) == (c * c)) return true;
    if ((b * b + c * c) == (a * a)) return true;
    if ((a * a + c * c) == (b * b)) return true;
    return false;
  }

  public static void main(String[] args) {
    // main function
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the triplet");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    if (check(a, b, c)) System.out.println(
      "They are Pythogorean tripet"
    ); else System.out.println("They are NOT Pythogorean tripet");
  }
}
