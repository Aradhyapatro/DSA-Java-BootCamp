package com.LeetCodeString.Easy;

public class haystack {
    public static void main(String[] args) {
        System.out.println(hay("aradhya","ara"));
    }

    public static int hay(String s,String ss){
        if(s.contains(ss)){
            return s.indexOf(ss);
        }
        else{
            return -1;
        }
    }
}
