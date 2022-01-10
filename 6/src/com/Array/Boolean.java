package com.Array;

import java.util.Arrays;
import java.util.stream.IntStream;

import static java.util.stream.IntStream.*;

public class Boolean {
    public static void main(String[] args) {
        String Sentence="thequickbrownfoxjumpsoverthelazydog";
        boolean[] arr=new boolean[26];
        for(int i=0;i<(Sentence.length());i++) {
            char c = Sentence.charAt(i);
            char a = 'a';
            int cc = (int) a;
            int c1 = (int) c;
            arr[(c1 - cc)] = true;
        };
        System.out.println(Arrays.toString(arr));
    }
}
