package com.AradhyaPatro;

public class MissingPositiveNumber {
    public static void main(String[] args) {
        int[] nums={-3,0,1,2,3,5,4,6,-18};
        System.out.println(firstMissingPositive(nums));
    }

    public static int firstMissingPositive(int[] nums) {
        int n=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>n)
                n=nums[i];
        }

        int[] arr=new int[n+10];
        for(int i=0;i<(n+10);i++)
        {
            arr[i]=0;
        }

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<0)
                continue;
            arr[nums[i]]++;
        }

        int i=0;
        while(true)
        {
            if(arr[i]==0)
                return i;
            i++;
            if(i>arr.length)
                break;
        }
        return -1;
    }
}
