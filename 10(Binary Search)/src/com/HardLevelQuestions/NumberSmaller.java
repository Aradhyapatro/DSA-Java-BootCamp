package com.HardLevelQuestions;

import java.util.ArrayList;

public class NumberSmaller{
    public static void main(String[] args) {
        int[] arr={5,6,2,1};
        System.out.println(SmallerNext(arr));
    }

    static int[] count;
    private static ArrayList<Integer> SmallerNext(int[] arr) {
        ArrayList<Integer> result=new ArrayList<>();
        int[] originalIndex=new int[arr.length];
        count=new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            originalIndex[i]=i;
        }

        sort(arr,originalIndex,0,arr.length-1);

        for (int i = 0; i < count.length; i++) {
            result.add(count[i]);
        }

        return result;
    }

    private static void sort(int[] arr, int[] originalIndex, int l, int r) {
        if(l<r){
            int mid=(l+r)/2;

            sort(arr,originalIndex,l,mid);
            sort(arr,originalIndex,mid+1,r);
            merge(arr,originalIndex,l,mid,r);
        }
    }

    private static void merge(int[] arr, int[] originalIndex, int l, int mid, int r) {
        int larrsize=mid-l+1;
        int rarrsize=r-mid;

        int[] larr=new int[larrsize];
        int[] rarr=new int[rarrsize];

        for (int i = 0; i < larrsize; i++) {
            larr[i]=originalIndex[l+i];
        }

        for (int i = 0; i < rarrsize; i++) {
            rarr[i]=originalIndex[i+mid+1];
        }

        int i=0,j=0,k=l,rightCount=0;
        while(i<larrsize && j<rarrsize){
            if (arr[larr[i]]<=arr[rarr[j]]){
                originalIndex[k]=larr[i];
                count[larr[i]]+=rightCount;
                i++;
            }else{
                originalIndex[k]=rarr[j];
                rightCount++;
                j++;
            }

            k++;
        }

        while(i<larrsize){
            originalIndex[k]=larr[i];
            count[larr[i]]+=rightCount;
            i++;
            k++;
        }

        while(j<rarrsize){
            originalIndex[k]=rarr[j];
            j++;
            k++;
        }
    }
}