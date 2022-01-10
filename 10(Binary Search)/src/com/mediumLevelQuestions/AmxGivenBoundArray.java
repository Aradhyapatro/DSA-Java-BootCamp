package com.mediumLevelQuestions;

import java.util.ArrayList;

public class AmxGivenBoundArray {
    public static void main(String[] args) {
        int n=4;
        int index=2;
        int maxSum=6;
        System.out.println(BoundArray(n,index,maxSum));
    }

    static ArrayList<ArrayList<Integer>> a=new ArrayList<>();

    private static int BoundArray(int n, int index, int maxSum) {
        ArrayList<Integer> arr=new ArrayList<>();
        bound(n,maxSum,maxSum/n,arr);
        System.out.println(a);
        arr=a.get(a.size()-1);
        return arr.get(index);
    }

    private static void bound(int n, int maxSum, int i,ArrayList<Integer> arr) {
        if(n<0 || maxSum<0){
            return;
        }

        if(n==0){
            if(maxSum==0){
                ArrayList<Integer> s=new ArrayList<>(arr.size());
                for (int t:arr) {
                    s.add(t);
                }
                if(!a.contains(s)){
                    a.add(s);
                }
            }
        }

        arr.add(i);
        n--;
        maxSum=maxSum-i;

//        recursive calls
        bound(n,maxSum,i-1,arr);
        bound(n,maxSum,i,arr);
        bound(n,maxSum,i+1,arr);

        arr.remove(arr.size()-1);
    }
}
