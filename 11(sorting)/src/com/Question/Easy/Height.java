package com.Question.Easy;

import java.util.Arrays;

public class Height {
    public static void main(String[] args) {
        int[] arr = {1,1,4,2,1,3};
        System.out.println(height(arr));
    }

    private static int height(int[] arr) {
        int c = 0;
        int[] temp=new int[arr.length];
        for (int i = 0; i < temp.length; i++) {
            temp[i]=arr[i];
        }

        Arrays.sort(temp);

        for (int i = 0; i < temp.length; i++) {
            if(temp[i]!=arr[i]){
                c++;
            }
        }
        return c;
    }
}
