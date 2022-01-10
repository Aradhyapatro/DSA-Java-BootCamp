package com.HardLevelQuestions;

import java.util.Arrays;

public class smallerElementToRight {
    public static void main(String[] args) {
        int[] arr={5,2,6,1};
        System.out.println(Arrays.toString(chenge(arr)));
    }

    private static int[] chenge(int[] arr) {
        int[] a=new int[arr.length];
        int k=0;
        for (int i = 0; i < arr.length-1; i++) {
            int[] b=Arrays.copyOfRange(arr,i+1,arr.length);
            Arrays.sort(b);
            int m=BinarySearch(b,arr[i]);
            a[k]=m;
            k++;
        }
        a[arr.length-1]=0;
        return a;
    }

    private static int BinarySearch(int[] b,int ele) {
        int s=0;
        int e=b.length-1;

        int mid;
        int ans=0;
        while (s<=e){
            mid=s+(e-s)/2;
            if(b[mid]>=ele){
                e=mid-1;
            }
            else{
                ans=ele;
                s=mid+1;
                continue;
            }
        }
        return ans;
    }
}
