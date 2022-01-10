package com.HardLevelQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class smallerNumberAfterSelf {
    public static void main(String[] args) {
        int[] arr={26,78,27,100,33,67,90,23,66,5,38,7,35,23,52,22,83,51,98,69,81,32,78,28,94,13,2,97,3,76,99,51,9,21,84,66,65,36,100,41};
        System.out.println(countSmaller(arr));
    }

    public static List<Integer> countSmaller(int[] nums) {
        List<Integer> a=new ArrayList<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            if(i==nums.length-1){
                a.add(0);
                break;
            }
            int[] arr= Arrays.copyOfRange(nums,i,nums.length);
            Arrays.sort(arr);
            int n=BinarySearch(arr,nums[i]);
            a.add(n);
        }
        return a;
    }

    public static int BinarySearch(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        int ans=-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                ans=mid;
                end=mid-1;
            }else if(arr[mid]>target){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return ans;
    }
}
