package com.RecursionPattern;

import java.util.Arrays;

public class SelectionSorting {
    public static void main(String[] args) {
        int[] arr={3,6,4,2,1,5};
        SelectionSort(arr,arr.length-1,0,0);
        System.out.println(Arrays.toString(arr));
    }

    private static void SelectionSort(int[] arr, int r, int c, int index) {
        if(r==0){
            return;
        }

        if(c<=r){
            if(arr[c]>arr[index]){
                index=c;
            }
            SelectionSort(arr,r,c+1,index);
        }else{
            int t=arr[index];
            arr[index]=arr[c-1];
            arr[c-1]=t;
            SelectionSort(arr,r-1,0,0);
        }
    }
}
