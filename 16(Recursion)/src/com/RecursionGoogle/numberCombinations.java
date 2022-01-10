package com.RecursionGoogle;

import java.util.ArrayList;

public class numberCombinations {
    public static void main(String[] args) {
        String s="123";
        System.out.println(combinations("",s));
    }

    private static ArrayList<String> combinations(String s, String s1) {
        if(s1.isEmpty()){
            ArrayList<String> ss=new ArrayList<>();
//            System.out.println(s);
            ss.add(s);
            return ss;
        }

        ArrayList<String> arr=new ArrayList<>();

        int n=s1.charAt(0) - '0';
        for (int i = 'a'+((n-1)*3); i < 'a'+((n-1)*3)+3; i++) {
            if(i>='a'+26){
                return arr;
            }
            char cc=(char)i;
//            System.out.println("cc="+cc);
            arr.addAll(combinations(s+cc,s1.substring(1)));
        }
        return arr;
    }


}
