package com.AradhyaPatro;

public class BinarySearchRecursion {
    public static void main(String[] args) {
        int[] arr={1,3,5,7,9,11,126,787};
        System.out.println(BS(arr,126,0,arr.length-1));
    }

    public static int BS(int[] arr, int n, int s, int e) {
        if(s>e){
            return -1;
        }

        int mid=s+(e-s)/2;
        if(arr[mid]==n){
            return mid;
        }else if(arr[mid]<n){
            return BS(arr,n,mid+1,e);
        }else{
            return BS(arr,n,s,mid-1);
        }
    }
}
