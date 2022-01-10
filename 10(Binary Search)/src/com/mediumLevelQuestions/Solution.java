package com.mediumLevelQuestions;

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int[] arr={1,10,4,4,2,7};
        int[] arr1={9,3,5,1,7,4};
        System.out.println(minAbsoluteSumDiff(arr,arr1));
    }

    public static int minAbsoluteSumDiff(int[] nums1, int[] nums2) {
        long sum=0;
        int mod=100000007;

        int[] diff=new int[nums2.length];
        for (int i = 0; i < diff.length; i++) {
            diff[i]=Math.abs(nums1[i]-nums2[i]);
            sum+=diff[i];
        }

        if(sum==0) {
            return 0;
        }

        Arrays.sort(nums1);
        long minsum=sum;

        for (int i = 0; i < nums2.length; i++) {
            int left=0;
            int right=nums1.length-1;

            while (left<=right){
                int mid=left+(right-left)/2;
                int su=Math.abs(nums1[mid]-nums2[i]);
                long difference=sum-diff[i]+su;
                if(minsum>difference){
                    minsum=difference;
                }

                if(nums1[mid]>nums2[i]){
                    right=mid-1;
                }else{
                    left=mid+1;
                }
            }
        }
        return (int) (minsum%mod);
    }
}