package com.Question.Easy;

import java.util.Arrays;

public class ThirdMax {
    public static void main(String[] args) {
        int[] arr={1,2,2,3,3,3,9,4,4,4,5,5,5,5,5,8,3,2};
        System.out.println(Third(arr));
    }

    private static int Third(int[] nums) {
        Arrays.sort(nums);
        if(nums.length<=2){
            return nums[nums.length-1];
        }
        int previous = Integer.MAX_VALUE;
        int count = 0;
        for(int p = nums.length -1; p>=0;p--){
            if(nums[p]!=previous){
                previous = nums[p];
                count++;
            }
            if(count ==3){
                return previous;
            }
        }
        if(count >0){
            return nums[nums.length-1];
        }

        return previous;
    }
}
