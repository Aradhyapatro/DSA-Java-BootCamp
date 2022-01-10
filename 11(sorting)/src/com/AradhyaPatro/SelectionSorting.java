package com.AradhyaPatro;

import java.util.Arrays;

public class SelectionSorting {
    public static void main(String[] args) {
        int[] arr = {11, 3, 6, 9, 2, 8, 10};
        System.out.println(Arrays.toString(Select(arr)));
    }

    public static int[] Select(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[index] > arr[j]) {
                    index = j;
                }
            }
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}
