package com._2D;

import java.util.Scanner;

public class TwoDArrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the no. of rows");
        int r=sc.nextInt();
        System.out.println("Enter the no. of cols");
        int c=sc.nextInt();

        System.out.println("Enter in sorted way");
        int[][] arr=new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j]=sc.nextInt();
            }
        }

        System.out.println("Enter the target");
        int target=sc.nextInt();

        int start=0;
        int end=arr[0].length-1;
        int i=-1,j=-1;

        while(start<arr.length && end>=0)
        {
            if(arr[start][end]==target)
            {
                i=start;
                j=end;
                break;
            }
            else if(arr[start][end]>target)
            {
                end--;
            }
            else if(arr[start][start]<target)
            {
                start++;
            }
        }

        System.out.println(i+ " " +j);
    }
}
