package com.mediumLevelQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _4Sum {
    public static void main(String[] args) {
        int[] arr={-1,0,-5,-2,-2,-4,0,1,-2};
        System.out.println((fourSum(arr,-9)));
    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> arr=new ArrayList<>(10);
        System.out.println(Arrays.toString(nums));

        for(int i=0;i<nums.length-3;i++){
            if(i!=0 && nums[i]==nums[i-1]){
                continue;
            }

            for(int j=i+1;j<nums.length-2;j++){

                if(j!=i+1 && nums[j]==nums[j-1]){
                    continue;
                }

                int left=j+1;
                int right=nums.length-1;

                while(left<right){
                    int sum=nums[i]+nums[j]+nums[left]+nums[right];

                    if(sum==target){
                        List<Integer> a=new ArrayList<>(4);
                        a.add(nums[i]);
                        a.add(nums[j]);
                        a.add(nums[left]);
                        a.add(nums[right]);
                        if(!arr.contains(a)){
                            arr.add(a);
                        }

                        right--;
                        left++;

//                        while(left<=right && nums[left]!=0 && nums[left]==nums[left-1]){
//                            left++;
//                        }

//                        while(left<=right && nums[right]!=0 && nums[right]==nums[right-1]){
//                            right--;
//                        }

                    }else if(sum>target){
                        right--;
                    }else{
                        left++;
                    }

                }
            }
        }
        return arr;
    }
}
