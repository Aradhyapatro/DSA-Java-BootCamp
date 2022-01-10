package com.LeetCodeString.Easy;

public class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println(palidrome("0P"));
    }

    private static boolean palidrome(String s) {
        StringBuilder ss=new StringBuilder("");
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(Character.isAlphabetic(c) || Character.isDigit(c)){
                ss.append(c);
            }
        }

        if((ss.toString()).equalsIgnoreCase(ss.reverse().toString()))
        {
            return true;
        }
        return false;
    }
}
