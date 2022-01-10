package com.AradhyaPatro;

import java.util.Arrays;

public class distance {
    public static int BinarySearch(int[] nums,int start,int end,int target)
    {
        while(start<=end)
        {
            int mid=start+((end-start)/2);
            if(nums[mid]<target)
            {
                start=mid+1;
            }
            else if(nums[mid]>target)
            {
                end=mid-1;
            }
            else
            {
                return mid;
            }
        }
        return -1;
    }

    public static int[] searchRange(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        int min=-1,max=-1;
        int[] arr={-1,-1};

        min=BinarySearch(nums,start,end,target);
        max=min;

        if(min==-1 || max ==-1)
        {
            return arr;
        }

        for(int i=max+1;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                max++;
            }
            else
            {
                break;
            }
        }

        for(int i=min-1;i>=0;i--)
        {
            if(nums[i]==target)
            {
                min--;
            }
            else
            {
                break;
            }
        }

        arr[0]=min;
        arr[1]=max;

        return arr;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3};
        int target=1;
        int[] arr1=new int[2];
        arr1=searchRange(arr,target);
        System.out.println(Arrays.toString(arr1));
    }
}
