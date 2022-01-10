package com.mediumLevelQuestions;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FirstAndLast {
    public static void main(String[] args) {
        int[] arr={5,5,5,7,7,7,7,8,8,10};
        System.out.println(Arrays.toString(searchRange(arr,8)));
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] arr={-1,-1};

        arr[0]=BinarySearch(nums,target,true);
        arr[1]=BinarySearch(nums,target,false);

        return arr;
    }

    public static int BinarySearch(int[] arr,int target,boolean index){
        int ans=-1;

        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                ans=mid;
                if(index){
                    end=mid-1;
                }
                else
                {
                    start=mid+1;
                }
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return ans;
    }
}
