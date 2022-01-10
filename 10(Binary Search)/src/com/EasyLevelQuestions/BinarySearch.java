package com.EasyLevelQuestions;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={0,1,2,3,4,8,9,10,11,12,13,14,14,15,16,17,18,19};
        System.out.println(BinarySearchFunc(arr,8));
    }

    private static int BinarySearchFunc(int[] arr, int i) {
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==i){
                return mid;
            }else if(arr[mid]<i){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }


}
