package com.AradhyaPatro;

public class subArray {

  public static void main(String[] args) {
    // main function

    int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
    int max = Integer.MIN_VALUE;
    int sum = 0;
    int p = 0, q = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
      q++;
      if (max < sum) {
        max = sum;
      }
      if (max < arr[i]) {
        p = i;
        q = i;
        sum = arr[i];
      }
    }
    System.out.println(max + " " + p + " " + q);
  }
}
