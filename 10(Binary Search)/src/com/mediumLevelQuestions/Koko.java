package com.mediumLevelQuestions;

import static java.lang.Math.max;

public class Koko {
    public static void main(String[] args) {
        int[] arr={3,6,7,11};
        int h=8;
        System.out.println(FindK(arr,h));
    }

    private static int FindK(int[] arr, int h) {
        int start=1,end=0;

        for (int i = 0; i < arr.length; i++) {
            end=max(end,arr[i]);
        }

        int ans=start;
        System.out.println("min ="+start+" max ="+end);
        while(start<=end){
            int mid=start+(end-start)/2;

            if(ifPossible(mid,arr,h)){
                end = mid-1;
                ans=mid;
            }else{
                start=mid+1;
            }
        }

        return ans;
    }

    private static boolean ifPossible(int mid, int[] arr, int h) {
        int time = 0;
        for (int p : arr) {
            time += (p - 1) / mid + 1;
            if (time > h)
                return false;
        }
        return true;
    }
}
