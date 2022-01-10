// package com.CyclicQuestion;

import java.util.ArrayList;
import java.util.Arrays;

public class AllMissingNumber {
    public static void main(String[] args) {
        int[] arr={3,1,5,0,3,5,6,9,7,8,9};
        CycleSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(foundThem(arr));
    }

    public static ArrayList<Integer> foundThem(int[] arr)
    {
        ArrayList<Integer> a=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=i) {
                a.add(i);
            }
        }
        return a;
    }

    public static void CycleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int crt=arr[i];
            if(arr[i]!=i)
            {
                int temp=arr[i];
                arr[i]=arr[crt];
                arr[crt]=temp;
            }

        }
    }
}
