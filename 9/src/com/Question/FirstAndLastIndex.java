package com.Question;

import java.util.Arrays;

public class FirstAndLastIndex {
    public static void main(String[] args) {
        int[] arr={1,3,5,7,7,7,7,8,8,10};
        System.out.println(Arrays.toString(pos(arr,7)));
    }

    public static int binarySearch(int[] arr,int target,int start,int end){
        while(start<=end) {
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target)
            {
                end=mid-1;
            }
            else
                start=mid+1;
        }
        return -1;
    }

    public static int[] pos(int[] arr,int n) {
        int[] m={-1,-1};
        int f=-1;
//        finding first index
        int i=binarySearch(arr,n,0,arr.length);
        if(i!=-1)
        {
            f=binarySearch(arr,n,0,i-1);
        }
        if(f!=-1)
            m[0]=f;
        else
            m[0]=i;

//        finding the last index
        i=binarySearch(arr,n,0,arr.length);
        if(i!=-1)
        {
            f=binarySearch(arr,n,0,i+1);
        }
        if(f!=-1)
            m[1]=f;
        else
            m[1]=i;

        return m;
    }
}
