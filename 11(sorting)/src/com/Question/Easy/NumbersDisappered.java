package com.Question.Easy;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class NumbersDisappered {
    public static void main(String[] args) {
        int[] a={1,1};
        System.out.println(findDisappearedNumbers(a));
    }

    public static ArrayList<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer> a=new ArrayList<>();
        int[] arr=new int[nums[nums.length-1]+1];

        for (int i = 0; i < nums.length; i++) {
            arr[nums[i]]=1;
        }

        int c=0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]==0){
                a.add(i);
            }else{
                c++;
            }

        }
        if(a.size()==0 && c!=nums.length){
            a.add(nums[nums.length-1]+1);
        }

        return a;
    }
}
