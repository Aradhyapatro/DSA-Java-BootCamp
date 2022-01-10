package com.Sort;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr={3,2,1,4,5};
        sort(arr,1);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr,int n) {
        if(n==arr.length){
            return;
        }

        int last=arr[n];
        int j=n-1;
        while (j>=0 && arr[j]>last){
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1]=last;

        sort(arr,n+1);
    }
}
