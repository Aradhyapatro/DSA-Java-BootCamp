package com.EasyLevelQuestions;

public class FindX {

    public static void main(String[] args) {
        int[] arr={0,4,3,0,4};
        System.out.println(Found(arr));
    }

    private static int Found(int[] arr) {
        int[] a=new int[1001];

        if(arr.length==0){
            return 0;
        }

        for (int i = 0; i < arr.length; i++) {
            a[arr[i]]++;
        }

        for (int i = 1; i < 1001; i++) {
            int sum=a[i-1];
            if(i==(arr.length-sum)){
                return i;
            }
            a[i]+=sum;
        }
        return -1;
    }
}
