package com.LeetCodeString.Easy;

public class split {
    public static void main(String[] args) {
        System.out.println(halvesAreAlike("lookbook"));
    }

    public static int count(StringBuilder s){
        int t=0;
        for (int i = 0; i < s.length(); i++) {
            char c=s.charAt(i);
            if(c=='a'|| c=='e' || c=='i' || c=='o' || c=='u' || c=='A' ||c=='E' ||c=='I' || c=='O' || c=='U'){
                t++;
            }
        }
        return t;
    }

    public static boolean halvesAreAlike(String s) {
        int l1=(s.length()/2)-1;
        StringBuilder a1=new StringBuilder(s.substring(0,l1+1));
        StringBuilder a2=new StringBuilder(s.substring(l1+1));
        int n=count(a1);
        int m=count(a2);
        if(n==m)
            return true;
        else
            return false;
    }
}
