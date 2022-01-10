package com.CyclicQuestion;

import java.util.Arrays;

public class FindTheMissingNumber {
    public static void main(String[] args) {
        int[] arr={1,4,3,5,2,4};
        CyclicSort(arr);
//        System.out.println(Arrays.toString(arr));
        System.out.println(CyclicSort(arr));
    }

    public static int found(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=i+1)
                return arr[i];
        }
        return arr.length;
    }

    public static int CyclicSort(int[] arr)
    {
        for (int i = 0; i < arr.length;) {
            int crt=arr[i]-1;
            if(arr[i]!=i+1)
            {
                if(arr[i]!=arr[crt]) {
                    int temp = arr[i];
                    arr[i] = arr[crt];
                    arr[crt] = temp;
                }
                else
                {
                    return arr[i];
                }
            }
            else
            {
                i++;
            }
        }
        return -1;
    }
}
