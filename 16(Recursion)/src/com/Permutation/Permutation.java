package com.Permutation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Permutation {
    public static void main(String[] args) {
        String s = "arya";
//        permut("", s);
        ArrayList<String> ss = ((permutre("", s)));
        Collections.sort(ss);
        System.out.println(ss);
    }


    private static void permut(String s, String s1) {
        if (s1.length() == 0) {
            System.out.println(s);
            return;
        }

        for (int i = 0; i <= s.length(); i++) {
            String f = s.substring(0, i);
            String l = s.substring(i);
            permut(f + s1.charAt(0) + l, s1.substring(1));
        }
    }

    private static ArrayList<String> permutre(String s, String s1) {
        if (s1.length() == 0) {
            ArrayList<String> a=new ArrayList<>();
            a.add(s);
            return a;
        }

        ArrayList<String> a=new ArrayList<>();
        for (int i = 0; i <= s.length(); i++) {
            String f = s.substring(0, i);
            String l = s.substring(i);
            a.addAll(permutre(f + s1.charAt(0) + l, s1.substring(1)));
        }

        return a;
    }

    private static int permutCount(String s, String s1) {
        if (s1.length() == 0) {
//            System.out.println(s);
            return 1;
        }

        int c=0;
        for (int i = 0; i <= s.length(); i++) {
            String f = s.substring(0, i);
            String l = s.substring(i);
            c+=permutCount(f + s1.charAt(0) + l, s1.substring(1));
        }

        return c;
    }
}
