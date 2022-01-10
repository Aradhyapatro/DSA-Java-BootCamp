package com.mediumLevelQuestions;

import java.util.Arrays;

public class SumDiff {
    public static void main(String[] args) {
        int[] num1={1,10,4,4,2,7};
        int[] num2={9,3,5,1,7,4};

        System.out.println(MiniSumDiff(num1,num2));
    }

    private static int MiniSumDiff(int[] num1, int[] num2) {
        int[] diff=new int[num1.length];
        long M=1000_000_007;
        int sum=0;
        int[] sortedNum1= Arrays.copyOf(num1,num1.length);
        Arrays.sort(sortedNum1);
        int[] bestDiff=new int[num1.length];

        for (int i = 0; i < num1.length; i++) {
            diff[i]=Math.abs(num1[i]-num2[i]);
            sum= (int) ((sum+diff[i])%M);
            int temp=LowerBound(sortedNum1,num2[i]);

            if(temp!=0){
                bestDiff[i]=Math.min(Math.abs(sortedNum1[temp]-num2[i]),Math.abs(sortedNum1[temp-1]-num2[i]));
            }
            else{
                bestDiff[i]=Math.abs(sortedNum1[temp]-num2[i]);
            }
        }
        int[] saved=new int[num1.length];
        for (int i = 0; i < num1.length; i++) {
            saved[i]=Math.abs(diff[i]-bestDiff[i]);
        }

        int max=Integer.MIN_VALUE;
        for (int i = 0; i < num1.length; i++) {
            if(saved[i]>max){
                max=saved[i];
            }
        }
        System.out.println("DIFF ->"+Arrays.toString(diff));
        System.out.println("BEST DIFF ->"+Arrays.toString(bestDiff));
        System.out.println("SAVED DIFF ->"+Arrays.toString(saved));
        return (int) ((sum-max)%M);
    }

    private static int LowerBound(int[] num2, int n) {
        int start=0;
        int end=num2.length-1;
        int ans=0;
        while(start<=end){
            int mid=start+(end-start)/2;

            if(num2[mid]==n){
                return mid;
            }else if(num2[mid]<n){
                ans=mid;
                start=mid+1;
            }else{
                end=mid-1;
            }
        }

        return ans;
    }
}
