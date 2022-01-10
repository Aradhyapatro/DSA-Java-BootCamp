package com.Part_II;

import java.util.ArrayList;

public class fact {
    public static void main(String[] args) {
        factors(360);
    }

    private static void factors(int n) {
        ArrayList<Integer> arr=new ArrayList<>(10);
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if(n%i==0){
                if(n/i==i){
                    System.out.print(i+" ");
                }
                else{
                    System.out.print(i+" ");
                    arr.add(n/i);
                }
            }
        }
        for (int i = arr.size()-1; i >= 0 ; i--) {
            System.out.print(arr.get(i)+" ");
        }
    }
}
