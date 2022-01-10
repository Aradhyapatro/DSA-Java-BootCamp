package com.Sort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr={2,4,7,6,5,3,1};
        QuickSorting(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void QuickSorting(int[] arr,int low,int high) {
        if(low>high){
            return;
        }

        int s=low;
        int e=high;
        int p=low+(high-low)/2;

        while(low<=p && high>=p){
            while(arr[low]<arr[p]){
                low++;
            }

            while (arr[high]>arr[p]){
                high--;
            }

            if(low<=high){
                int t=arr[low];
                arr[low]=arr[high];
                arr[high]=t;
                low++;
                high--;
            }
        }

        QuickSorting(arr,s,high);
        QuickSorting(arr,low,e);
    }
}
