package com.AradhyaPatro;

import java.sql.PseudoColumnUsage;
import java.util.Scanner;

public class palinderomeNumber {

  public static void main(String[] args) {
    // main function
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int n = sc.nextInt();
    palindrome(n);
    sc.close();
  }

  private static void palindrome(int n) {
    int n1=n,num=0;
    while(n1>0)
    {
      int r=n1%10;
      num=num*10+r;
      n1=n1/10;
    }
    if(n==num)
      System.out.println("Number is palindrome");
    else
      System.out.println("Number is not palindrome");
  }
}
