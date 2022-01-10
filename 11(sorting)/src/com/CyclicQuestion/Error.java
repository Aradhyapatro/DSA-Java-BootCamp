package com.CyclicQuestion;

import java.util.Arrays;

public class Error {
    public static void main(String[] args) {
        int[] arr={4,2,1,3,2,0};
        System.out.println(Arrays.toString(CyclicSort(arr)));
    }

    public static int[] CyclicSort(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            int crt=arr[i];
            if(arr[i]!=arr[crt])
            {
                int temp=arr[i];
                arr[i]=arr[crt];
                arr[crt]=temp;
            }
        }

        System.out.println(Arrays.toString(arr));

        int[] a={-1,-1};
        for (int i = 0; i <arr.length; i++) {
            if(arr[i]!=i)
            {
                a[0]=arr[i];
                a[1]=i;
            }
        }
        return a;
    }
}
