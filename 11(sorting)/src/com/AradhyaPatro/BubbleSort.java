package com.AradhyaPatro;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={6,3,8,1,9,10,5};

        System.out.println(Arrays.toString(Bubble(arr)));
    }

    public static int[] Bubble(int[] arr)
    {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if(arr[j]<arr[j-1])
                {
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }
}
