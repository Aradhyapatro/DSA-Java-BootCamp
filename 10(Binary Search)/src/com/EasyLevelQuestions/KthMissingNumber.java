package com.EasyLevelQuestions;

import java.util.Arrays;

public class KthMissingNumber {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,7,11};
        System.out.println(findKthPositive(arr,2));
    }

    public static int findKthPositive(int[] arr, int k) {
        int[] a=new int[1001];
        for(int i=0;i<arr.length;i++){
            a[arr[i]]++;
        }

        int c=0;
        System.out.println(Arrays.toString(a));
        for(int i=1;i<a.length;i++){
            if (a[i]==0){
                c++;
                if(c==k){
                    return i;
                }
            }
        }
        return -1;
    }
}
