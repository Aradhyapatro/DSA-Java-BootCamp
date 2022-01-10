package com.Question.Easy;

import java.util.ArrayList;
import java.util.Arrays;

public class Intersection {
    public static void main(String[] args) {
        int[] a = {4,9,5};
        int[] b = {9,4,9,8,4};

        System.out.println(Arrays.toString(InterSection(a, b)));
    }

    private static int[] InterSection(int[] nums1, int[] nums2) {
        ArrayList<Integer> a=new ArrayList<>();

        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j] && !a.contains(nums1[i])){
                    a.add(nums1[i]);
                    j+=nums2.length;
                }
            }
        }

        int k=a.size();
        int[] arr=new int[k];
        for (int i = 0; i < k; i++) {
            arr[i]=a.get(i);
        }
        return arr;
    }
}
