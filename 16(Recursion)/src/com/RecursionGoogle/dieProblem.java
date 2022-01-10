package com.RecursionGoogle;

import java.util.ArrayList;

public class dieProblem {
    public static void main(String[] args) {
        int[] num={1,2,3,4,5,6};
        System.out.println(die("",4));
    }

    private static ArrayList<String> die(String s, int up) {
//        if(up<0){
//            ArrayList<String> ss =new ArrayList<>();
//            return ss;
//        }

        if(up==0){
//            System.out.println(s);
            ArrayList<String> ss =new ArrayList<>();
            ss.add(s);
            return ss;
        }

        ArrayList<String> ss =new ArrayList<>();
        for (int i = 1; i <= 6 && i<=up; i++) {
            ss.addAll(die(s+(char)('0'+i),up-i));
        }

        return ss;
    }
}
