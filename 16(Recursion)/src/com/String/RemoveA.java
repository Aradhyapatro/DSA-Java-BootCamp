package com.String;

public class RemoveA {
    public static void main(String[] args) {
        String s="Aradhya";
        System.out.println(del(s));
    }

    private static String del(String s) {
        char c=s.charAt(0);
        if(s.length()==1){
            if(c=='a' || c=='A'){
                return "";
            }
            return s;
        }

        if(c=='A' || c=='a'){
            return del(s.substring(1));
        }
        return c+del(s.substring(1));
    }
}
