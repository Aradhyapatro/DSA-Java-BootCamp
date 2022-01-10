package com.mediumLevelQuestions;

public class SearchSingleDigit {
    public static void main(String[] args) {
        int[] arr={1,1,2,3,3,4,4,7,7};
        System.out.println(singleNonDuplicate(arr));
    }

    public static int singleNonDuplicate(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }

        if(nums.length==0){
            return -1;
        }

        int start=0;
        int end=nums.length-1;

        if(nums[0]!=nums[1]){
            return nums[0];
        }

        if(nums[nums.length-1]!=nums[nums.length-2]){
            return nums[nums.length-1];
        }

        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid>0 && mid<nums.length-1 && nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1]){
                return nums[mid];
            }else if(nums[mid]==nums[mid-1]){
                if((mid-start+1)%2!=0){
                    end=mid;
                }else{
                    start=mid+1;
                }
            }else{
                if((end-mid)%2!=0){
                    end=mid-1;
                }else{
                    start=mid;
                }
            }
        }
        return -1;
    }
}
