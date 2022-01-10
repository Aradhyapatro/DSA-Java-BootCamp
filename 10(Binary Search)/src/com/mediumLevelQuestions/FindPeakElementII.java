package com.mediumLevelQuestions;

import java.util.Arrays;

public class FindPeakElementII {
    public static void main(String[] args) {
        int[][] arr={{1,2,3,4,5,6,7,8},{2,3,4,5,6,7,8,9},{3,4,5,6,7,8,9,10},{4,5,6,7,8,9,10,11}};
        System.out.println(Arrays.toString(GetMax(arr)));
    }

    private static int[] GetMax(int[][] arr) {
        int i=0,j=0;
        while(i>=0 && i<arr.length && j>=0 && j<arr[0].length){
            int[] result=peakElement(arr,i,j);
            if(result[0]==i && result[1]==j){
                return new int[]{i,j};
            }else{
                i=result[0];
                j=result[1];
            }
        }
        return null;
    }

    private static int[] peakElement(int[][] arr, int i, int j) {
        int ele=arr[i][j];
        int p=i,q=j,max=Integer.MIN_VALUE;

        if(i>0 && j>0 && ele<arr[i-1][j-1] && max<arr[i-1][j-1]) {
            max=arr[i-1][j-1];
            p=i-1;
            q=j-1;
        }

        if(i>0 && j<arr[0].length && ele<arr[i-1][j] && max<arr[i-1][j]) {
            max=arr[i-1][j];
            p=i-1;
            q=j;
        }

        if(i>0 && j<arr[j].length-1 && ele<arr[i-1][j+1] && max<arr[i-1][j+1]) {
            max=arr[i-1][j+1];
            p=i-1;
            q=j+1;
        }

        if(i<arr.length && j<arr[j].length-1 && ele<arr[i][j+1] && max<arr[i][j+1]) {
            max=arr[i][j+1];
            p=i;
            q=j+1;
        }

        if( i<arr.length-1 && j>0 && ele<arr[i+1][j-1] && max<arr[i+1][j-1]) {
            max=arr[i+1][j-1];
            p=i+1;
            q=j-1;
        }

        if( i<arr.length-1 && j<arr[0].length && ele<arr[i+1][j] && max<arr[i+1][j]) {
            max=arr[i+1][j];
            p=i+1;
            q=j;
        }

        if( i<arr.length-1 && j<arr[j].length-1 && ele<arr[i+1][j+1] && max<arr[i+1][j+1]) {
            max=arr[i+1][j+1];
            p=i+1;
            q=j+1;
        }

        if( i<arr.length && j>0 && ele<arr[i][j-1] && max<arr[i][j-1]) {
            max=arr[i][j-1];
            p=i;
            q=j-1;
        }

        return new int[]{p,q};
    }
}
