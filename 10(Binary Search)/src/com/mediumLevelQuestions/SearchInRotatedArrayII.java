package com.mediumLevelQuestions;

public class SearchInRotatedArrayII {
    public static void main(String[] args) {
        int[] arr={1,0,1,1,1};
        System.out.println(search(arr,0));
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

    public static int FindPeak(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }

            // if elements at middle, start, end are equal then just skip the duplicates
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                // skip the duplicates
                // NOTE: what if these elements at start and end were the pivot??
                // check if start is pivot
                if (start < end && arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;

                // check whether end is pivot
                if (end > start && arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }
            // left side is sorted, so pivot should be in right
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static boolean search(int[] nums, int target) {
        int peak=FindPeak(nums);
        System.out.println(peak);
        if(peak==-1){
            int b=BinarySearch(nums,target,0,nums.length-1);
            if(b!=-1) return true;
            else    return false;
        }

        int b1=BinarySearch(nums,target,0,peak);
        if(b1!=-1){
            return true;
        }

        b1=BinarySearch(nums,target,peak+1,nums.length-1);
        if(b1!=-1){
            return true;
        }
        return false;
    }
}
