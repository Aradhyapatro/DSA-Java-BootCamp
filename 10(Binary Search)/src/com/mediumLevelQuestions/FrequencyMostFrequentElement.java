package com.mediumLevelQuestions;

import java.util.Arrays;

public class FrequencyMostFrequentElement {
    public static void main(String[] args) {
        int[] arr={99,99999,99999,99999,99999,99999,99999};
        int k=100000;
        System.out.println(frequency(arr,k));
    }

    private static int frequency(int[] arr, int k) {
        Arrays.sort(arr);

        int l=0,r=0,res=1;
        long total=0;

        while(r<arr.length){
            total+=arr[r];

            while((arr[r]*(r-l+1))>(total+k)){
                total-=arr[l];
                l++;
            }

            res=Math.max(res,r-l+1);
            r++;
        }

        return res;
    }
}
