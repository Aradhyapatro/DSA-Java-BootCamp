package com.Part_II_Arrays_Recursion;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 4, 5, 6,4,12,4};
        int n=4;
//        if (LS(arr, n,0)) {
//            System.out.println("Element is Present in the Array");
//            System.out.println("At the position "+LSI(arr,n,0));
//        } else {
//            System.out.println("Element is NOT Present in the Array");
//        }

        ArrayList<Integer> a=new ArrayList<>(10);
        a=MLSI(arr,n,0,a);
        System.out.println(a);
    }


    private static ArrayList<Integer> MLSI(int[] arr, int n, int c,ArrayList<Integer> a) {
        if(arr[c]==n){
            a.add(c+1);
        }

        if(c==arr.length-1){
            return a;
        }

       return MLSI(arr,n,++c,a);
    }

    private static boolean LS(int[] arr, int n,int c) {
        if(arr[c]==n){
            return true;
        }

        if(c==arr.length-1){
            return false;
        }

        return LS(arr,n,++c);
    }

    private static int LSI(int[] arr, int n,int c) {
        if(arr[c]==n){
            return c+1;
        }

        if(c==arr.length-1){
            return -1;
        }

        return LSI(arr,n,++c);
    }


}
