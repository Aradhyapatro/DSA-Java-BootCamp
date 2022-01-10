package com.LeetCodeString.Easy;

public class shuffle {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,0,2,1,3};
        System.out.println("codeleet");
        System.out.println(shuffling("codeleet",arr));
    }

    public static String shuffling(String s,int[] arr){
        StringBuilder ss=new StringBuilder(s);
        for (int i = 0; i < s.length(); i++) {
            char c=s.charAt(i);
            ss.replace(arr[i],arr[i]+1,Character.toString(s.charAt(i)));
        }
        return ss.toString();
    }

}
