package com.LeetCodeString.Easy;

import java.util.Arrays;

public class Atmost {
    public static void main(String[] args) {
        System.out.println(checkOnesSegment("100"));
    }

    public static boolean checkOnesSegment(String s) {
        System.out.println(Arrays.toString(s.split("0")));
//        System.out.println(Arrays.toString(s.split("1")));
        String[] arr=s.split("0");
        int c=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=""){
                c++;
            }
        }
        if(c<=1){
            return true;
        }
        return false;
//        System.out.println((s.split("0")).length);
//        System.out.println((s.split("1")).length);


    }
}
