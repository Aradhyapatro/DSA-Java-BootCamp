package com.EasyLevelQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class Intersection {
    public static void main(String[] args) {
        int[] arr1={1,2,2,1};
        int[] arr2={2,2};

        System.out.println(Arrays.toString(Inter(arr1,arr2)));
    }

    private static int[] Inter(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int i=0,j=0,n=0;

        while (i<arr1.length && j<arr2.length){
            if(arr1[i]==arr2[j]){
                {
                    arr2[n]=arr2[j];
                    n++;
                }
                i++;
                j++;
            }else if(arr1[i]<arr2[j]){
                i++;
            }else{
                j++;
            }
        }
        return Arrays.copyOfRange(arr2,0,n);
    }
}
