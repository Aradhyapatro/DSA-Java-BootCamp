package com.mediumLevelQuestions;

import java.util.Arrays;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] arr={2,5,9,6,9,3,8,9,7,1};
        System.out.println(Duplicate(arr));
    }

    private static int Duplicate(int[] arr) {
        for (int i = 0; i < arr.length;) {
            int crt=arr[i]-1;
            if(arr[crt]!=arr[i]){
                int temp=arr[i];
                arr[i]=arr[crt];
                arr[crt]=temp;
            }else{
                i++;
            }
        }

        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=i+1){
                return arr[i];
            }
        }
        return -1;
    }
}
