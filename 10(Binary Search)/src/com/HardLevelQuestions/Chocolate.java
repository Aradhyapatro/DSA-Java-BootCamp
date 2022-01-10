package com.HardLevelQuestions;

public class Chocolate {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        System.out.println(find(arr,5));
    }

    private static int find(int[] arr, int n) {
        int start=0;
        int end=0;
        n++;

        for (int i = 0; i < arr.length; i++) {
            start=Math.max(start,arr[i]);
            end+=arr[i];
        }
        int minval=Integer.MAX_VALUE;

        while(start<end){
            int mid=start+(end-start)/2;
            int c=1;
            int sum=0;
            minval=Integer.MAX_VALUE;

            for (int num:arr) {
                if(num+sum>mid){
                    minval=Math.min(sum,minval);
                    sum=num;
                    c++;
                }else{
                    sum+=num;
                }
            }

            if(c>n){
                start=mid+1;
            }else{
                end=mid;
            }
        }

        return minval;
    }
}
