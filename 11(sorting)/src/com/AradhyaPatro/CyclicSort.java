package com.AradhyaPatro;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {3, 6, 2, 1, 5, 4, 9, 7, 8};
        CycleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void CycleSort(int[] arr) {
        for (int i = 0; i < arr.length; ) {
            int crt=arr[i]-1;
            if(arr[i]==arr[crt])
            {
                i++;
            }
            else
            {
                int temp=arr[i];
                arr[i]=arr[crt];
                arr[crt]=temp;
            }
        }
    }
}
