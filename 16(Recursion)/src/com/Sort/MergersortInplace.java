package com.Sort;

import java.util.Arrays;

public class MergersortInplace {
    public static void main(String[] args) {
        int[] arr={4,6,3,5,7,9,1,8,2};
        MergeSorting(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }

    private static void MergeSorting(int[] arr,int s,int e) {

        if (e-s==1){
            return;
        }

        int mid=(e+s)/2;

        MergeSorting(arr,s,mid);
        MergeSorting(arr,mid,e);

        int i=s,j=mid,k=0;
        int[] ans=new int[e-s];

        while(i<mid && j<e){
            if(arr[i]<arr[j]){
                ans[k]=arr[i];
                i++;
            }else{
                ans[k]=arr[j];
                j++;
            }
            k++;
        }

        while (i<mid){
            ans[k]=arr[i];
            i++;
            k++;
        }

        while (j<e){
            ans[k]=arr[j];
            j++;
            k++;
        }

        for (int l = 0; l < ans.length; l++) {
            arr[s+l]=ans[l];
        }
    }
}
