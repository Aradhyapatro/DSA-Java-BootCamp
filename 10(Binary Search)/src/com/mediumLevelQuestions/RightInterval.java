package com.mediumLevelQuestions;

import java.util.Arrays;

public class RightInterval {
    public static void main(String[] args) {
        int[][] arr = {{3, 4}, {2, 3}, {1, 2}};
//        interval(arr);
//        System.out.println(Arrays.toString(arr));
        System.out.println(arr[0][0]);
    }



//    private static int[] interval(int[][] arr) {
//        sort(arr);
//        int[] a=new int[arr[0].length];
//        for (int i = 0; i < arr.length; i++) {
//            int j=i+1;
//        }
////        return arr;
//    }

    private static void sort(int[][] arr) {
        for (int i=0;i<arr.length-1;i++){
            int index=i;
            int[] data=arr[i];
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j][0]<=data[0]){
                    index=j;
                    data=arr[j];
                }
            }
            int[] temp=arr[index];
            arr[index]=arr[i];
            arr[i]=temp;
        }
    }
}
