package com.Part_II_Arrays_Recursion;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr={5,6,7,1,2,3,4};
        System.out.println(find(arr,5,0,arr.length-1));
    }

    private static int find(int[] arr, int k,int s,int e) {

        int m=s+(e-s)/2;

        if(arr[m]==k){
            return m;
        }

        if(arr[s]<=arr[m]){
            if(arr[s]<=k && arr[m]>k){
                return find(arr,k,s,m-1);
            }else{
                return find(arr,k,m+1,e);
            }
        }

        if(k<arr[s] && k>arr[m]){
            return find(arr,k,m+1,e);
        }
        return find(arr,k,s,m-1);
    }
}
