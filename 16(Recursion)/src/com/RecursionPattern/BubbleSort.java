package com.RecursionPattern;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={3,5,4,7,1,8,9,2,6};
        Bubblesort(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }

    private static void Bubblesort(int[] arr, int r, int c) {
        if(r==0){
            return;
        }

        if(c<r){
            if(arr[c]>arr[c+1]){
                int t=arr[c];
                arr[c]=arr[c+1];
                arr[c+1]=t;
            }

            Bubblesort(arr,r,c+1);
        }else{
            Bubblesort(arr,r-1,0);
        }
    }

}
