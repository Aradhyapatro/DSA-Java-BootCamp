package com.Array;

import java.util.Arrays;
import java.util.Scanner;

public class twoD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a[][] = new int[3][];
//        int[][] a1 = new int[][]{
//                {1, 2, 3},
//                {4, 5},
//                {6, 7, 8}
//        };
//
//        for (int[] a2:a1) {
//            System.out.println(Arrays.toString(a));
//        }
//
//        for (int i = 0; i < a1.length; i++) {
//            for (int j = 0; j < a1[i].length; j++) {
//                System.out.print(a1[i][j]+" ");
//            }
//            System.out.println();
//        }


        System.out.println("Enter the row length");
        int arr[][] = new int[sc.nextInt()][];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the number of columns of " + i);
            int l = sc.nextInt();
            arr[i]= new int[l];
            for (int j = 0; j < l; j++) {
                int input=sc.nextInt();
                arr[i][j] = input;
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
