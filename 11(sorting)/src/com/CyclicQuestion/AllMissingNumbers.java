package com.CyclicQuestion;

import java.util.ArrayList;
import java.util.Arrays;

public class AllMissingNumbers {
    public static void main(String[] args) {
        int[] arr={0,1,1,4,3,2,5,5,5};
        System.out.println(CyclicSort(arr));
    }

    public static ArrayList<Integer> CyclicSort(int[] arr)
    {
        ArrayList<Integer> a =new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=i)
            {
                int crt=arr[i];
                if(arr[i]!=arr[crt]) {
                    int temp = arr[i];
                    arr[i] = arr[crt];
                    arr[crt] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=i)
            {
                a.add(arr[i]);
            }
        }
        return a;
    }
}
