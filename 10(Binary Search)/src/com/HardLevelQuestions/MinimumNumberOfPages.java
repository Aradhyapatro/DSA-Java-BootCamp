package com.HardLevelQuestions;

public class MinimumNumberOfPages {
    public static void main(String[] args) {
        int[] pages={12, 34, 67, 90};
        System.out.println(mini(pages,2));
    }

    private static int mini(int[] arr,int m) {
        int start=0;
        int end=0;

        for (int i = 0; i < arr.length; i++) {
            start=Math.max(start,arr[i]);
            end+=arr[i];
        }
        System.out.println(start + " "+end);

        while(start<end){
            int mid=start+(end-start)/2;
            int count=1;
            int sum=0;

            for (int j : arr) {
                if (sum + j > mid) {
                    sum = j;
                    count++;
                } else {
                    sum += j;
                }
            }

            if(count>m){
                start=mid+1;
            }else{
                end=mid;
            }
        }

        return end;
    }
}
