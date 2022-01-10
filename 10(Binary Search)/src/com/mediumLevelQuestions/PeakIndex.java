package com.mediumLevelQuestions;

public class PeakIndex {
    public static void main(String[] args) {
        int[] arr={6,5,4,3,2,3,2};
        System.out.println(Peak(arr));
    }

    private static int Peak(int[] arr) {
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                return mid;
            }else{
                start=mid+1;
            }
        }
        return start;
    }
}
