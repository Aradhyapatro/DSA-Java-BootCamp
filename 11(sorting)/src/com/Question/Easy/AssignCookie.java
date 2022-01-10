package com.Question.Easy;

import java.util.Arrays;

public class AssignCookie {
    public static void main(String[] args) {
        int[] g={1,2};
        int[] s={1,2,3};

        System.out.println(findContentChildren(g,s));
    }

    private static int findContentChildren(int[] g, int[] s) {
        Arrays.sort((g));
        Arrays.sort((s));

        int c=0;
        int i=0;
        int j=0;

        while(i<g.length && j<s.length){
            if(g[i]<=s[j]){
                i++;
                c++;
            }
            j++;
        }
        return c;
    }
}
