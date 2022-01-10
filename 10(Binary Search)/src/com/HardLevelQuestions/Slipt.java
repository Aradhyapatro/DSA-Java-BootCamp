package com.HardLevelQuestions;

public class Slipt {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        System.out.println(splitArray(arr,5));
    }

    private static int splitArray(int[] arr, int n) {
        int start=0;
        int end=0;

        for (int i = 0; i < arr.length; i++) {
            end+=arr[i];
            start=Math.max(start,arr[i]);
        }



        int ans=Integer.MAX_VALUE;
        while(start<end){
            int mid=start+(end-start)/2;
            int sum=0;
            int count=1;

            for (int j : arr) {
                if (sum + j > mid) {
                    sum = j;
                    count++;
                } else {
                    sum += j;
                }
            }

            if(count>n){
                start=mid+1;
            }else{
                end=mid;
            }
        }

        return end;
    }
}
