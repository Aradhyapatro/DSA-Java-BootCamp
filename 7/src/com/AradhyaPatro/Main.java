package com.AradhyaPatro;

import java.util.Scanner;

public class Main {

  public static int[] change(int arr[]) {}

  public static void main(String[] args) {
    // write your code here
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the length of the array");
    int l = sc.nextInt();
    int arr[] = new int[l];
    for (int i = 0; i < l; i++) {
      arr[i] = sc.nextInt();
    }
    arr = change(arr[]);
  }
}
