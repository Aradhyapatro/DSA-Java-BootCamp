package com.String;

import java.util.ArrayList;

public class Ascii {
    public static void main(String[] args) {
        String s="abc";
        ArrayList<String> ss=new ArrayList<>(10);
        subset("",s,ss);
        System.out.println(ss);
    }

    private static void subset(String s, String s1, ArrayList<String> ss) {
        if(s1.length()==0){
//            System.out.println(s);
            ss.add(s);
            return;
        }

        subset(s+(s1.charAt(0)+0),s1.substring(1),ss);
        subset(s,s1.substring(1),ss);

        return;
    }
}
