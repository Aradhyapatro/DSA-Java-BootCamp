package com.mediumLevelQuestions;

public class SearchInRotatedArray {
    public static void main(String[] args) {
        int[] arr={1,3,5};
        System.out.println(search(arr,6));
    }

    public static int FindPeak(int[] nums){
        int start=0;
        int s=nums[start];
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid<end && nums[mid]>nums[mid+1]){
                return mid;
            }else if(mid>0 && nums[mid]<nums[mid-1]){
                return mid-1;
            }else if(nums[mid]>s){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }

    public static int BinarySearch(int[] nums,int target,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]<target){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }

    public static int search(int[] nums, int target) {
        int peak=FindPeak(nums);
        System.out.println(peak);
        if(peak==-1){
            return BinarySearch(nums,target,0,nums.length-1);
        }
        int b1=BinarySearch(nums,target,0,peak);
        if(b1!=-1){
            return b1;
        }

        int b2=BinarySearch(nums,target,peak+1,nums.length-1);
        if(b2!=-1){
            return b2;
        }

        return -1;
    }
}
