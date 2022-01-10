package com.CyclicQuestion;

import java.util.Arrays;

public class missingNumber {
    public static void main(String[] args) {
        int[] arr={0,3,4,1,5,2,7};
        CycleSort(arr);
        System.out.println(foundDone(arr));
    }

    public static int foundDone(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=i)
            {
                return i;
            }
        }
        return arr.length+1;
    }

    public static void CycleSort(int[] arr) {
        for (int i = 0; i < arr.length; ) {
            int crt=arr[i];
            if(arr[i]!=i && arr[i]<arr.length)
            {
                int temp=arr[i];
                arr[i]=arr[crt];
                arr[crt]=temp;
            }
            else
            {
                i++;
            }
        }
    }
}
