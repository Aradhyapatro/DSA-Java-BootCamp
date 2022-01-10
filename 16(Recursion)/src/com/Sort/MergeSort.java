package com.Sort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr={4,6,3,5,7,9,1,8,2};
        int[] arr1=MergeSorting(arr);
        System.out.println(Arrays.toString(arr1));
    }

    private static int[] MergeSorting(int[] arr) {

        if (arr.length==1){
            return arr;
        }

        int mid=arr.length/2;

        int[] left=MergeSorting(Arrays.copyOfRange(arr,0,mid));
        int[] right=MergeSorting(Arrays.copyOfRange(arr,mid,arr.length));

        int[] ans=new int[left.length+right.length];

        int i=0,j=0,k=0;
        while(i<left.length && j<right.length){
            if(left[i]<right[j]){
                ans[k]=left[i];
                i++;
            }else{
                ans[k]=right[j];
                j++;
            }
            k++;
        }

        while (i<left.length){
            ans[k]=left[i];
            i++;
            k++;
        }

        while (j<right.length){
            ans[k]=right[j];
            j++;
            k++;
        }

        return ans;
    }
}
