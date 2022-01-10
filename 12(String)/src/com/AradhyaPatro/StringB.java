package com.AradhyaPatro;

import java.util.Arrays;
import java.util.Locale;

public class StringB {
    public static void main(String[] args) {
        StringBuilder s=new StringBuilder();
        for (int i = 0; i < 26; i++) {
            s=s.append((char)('a'+i));
        }
        s.replace(0,1,"z321");
        String ss="Aradhya patro";
        System.out.println(Arrays.toString(ss.toCharArray()));
        System.out.println(Arrays.toString(ss.split("a")));
    }
}
