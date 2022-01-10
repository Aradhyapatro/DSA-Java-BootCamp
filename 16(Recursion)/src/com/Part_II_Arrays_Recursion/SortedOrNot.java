package com.Part_II_Arrays_Recursion;

public class SortedOrNot {
    public static void main(String[] args) {
        int[] arr={1,3,5,7,8,9};
        if(sort(arr,0)){
            System.out.println("The array is Sorted");
        }else{
            System.out.println("The array is not Sorted");
        }
    }

    private static boolean sort(int[] arr, int n) {
        if(n==arr.length-1){
            return true;
        }


        return (arr[n]<arr[n+1] && sort(arr,n+1));
    }
}
