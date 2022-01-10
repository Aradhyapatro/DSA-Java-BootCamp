package com.LeetCodeString.Easy;

import java.util.ArrayList;
import java.util.Objects;

public class sorting {
    public static void main(String[] args) {
        char c='1';
        int n=c-'0';
        System.out.println(sort("is2 me3 this1"));
    }
    public static String sort(String s) {
        StringBuilder ss=new StringBuilder("");
        StringBuilder temp=new StringBuilder("");
        StringBuilder[] arr=new StringBuilder[9];
        for(int i=0;i<s.length();i++)
        {
            if (Objects.equals(s.charAt(i), ' ')) {
                continue;
            }
            int num = s.charAt(i) - '0';
            System.out.println(num);
            if (num >= 0 && num <= 9) {
                arr[num-1]=temp;
                temp = new StringBuilder("");
            } else {
                temp.append(s.charAt(i));
                ;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=null){
                ss.append(arr[i]+" ");
            }
        }
        return ss.toString();
    }
}
