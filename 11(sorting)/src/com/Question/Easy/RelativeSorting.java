package com.Question.Easy;

import java.util.ArrayList;
import java.util.Arrays;

public class RelativeSorting {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19};
        int[] a = {2, 1, 4, 3, 9, 6};
        System.out.println(Arrays.toString(relative(arr,a)));
    }

    private static int[] relative(int[] a, int[] b) {
        Arrays.sort(a);

        int[] arr=new int[a[a.length-1]+1];

        for (int i = 0; i < a.length; i++) {
            arr[a[i]]++;
        }

        int[] send=new int[a.length];
        int k=0;

        for (int i = 0; i < b.length; i++) {
            int n=b[i];
            while(arr[n]>0){
                send[k]=n;
                k++;
                arr[n]--;
            }
        }

        if(k<a.length){
            for (int i = 0; i < arr.length; i++) {
                while(arr[i]!=0){
                    send[k]=i;

                    k++;
                    arr[i]--;
                }
            }
        }

        return send;
    }
}
