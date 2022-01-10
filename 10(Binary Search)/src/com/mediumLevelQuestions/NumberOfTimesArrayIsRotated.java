package com.mediumLevelQuestions;

public class NumberOfTimesArrayIsRotated {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,1,2,3};
        System.out.println(rotate(arr)+1);
    }

    private static int rotate(int[] arr) {
        int start=0;
        int end=arr.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(mid<arr.length-1 && arr[mid]>arr[mid+1]){
                return mid;
            }else if(mid>0 && arr[mid]<arr[mid-1]){
                return mid-1;
            }else if(arr[start]<arr[mid]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
}
