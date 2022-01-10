package com.LeetCodeString.Easy;

public class Robot {
    public static void main(String[] args) {
        System.out.println("Did the robot return "+Did("UULDDRR"));
    }

    public static boolean Did(String s) {
        int u=0,l=0,d=0,r=0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='U') u++;
            else if(s.charAt(i)=='R') r++;
            else if(s.charAt(i)=='D') d++;
            else l++;
        }

        if(u==d && r==l){
            return true;
        }
        return false;
    }
}
