package com.Downloaded;

public class Reverses {
    public static void main(String[] args) {
        String s="I am Aradhya";
        System.out.println(rev(s));
    }

    private static String rev(String s) {
        StringBuilder ss=new StringBuilder(s);
        int start=0;
        int end=ss.length()-1;
        while(start<end){
            char c=ss.charAt(start);
            ss.replace(start,start+1, Character.toString(ss.charAt(end)));
            ss.replace(end,end+1,Character.toString(c));
            start++;
            end--;
        }
//        System.out.println("HELLO");
        return ss.toString();
    }
}
