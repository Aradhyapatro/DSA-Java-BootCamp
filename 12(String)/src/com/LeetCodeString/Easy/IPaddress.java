package com.LeetCodeString.Easy;

public class IPaddress {
    public static void main(String[] args) {
        System.out.println(defrag("121.111.1.11"));
    }
    public static String defrag(String s)
    {
        StringBuilder ss=new StringBuilder("");
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='.'){
//                StringBuilder s1=new StringBuilder("[" + s.charAt(i) + "]");
                ss.append("[" + s.charAt(i) + "]");
            }
            else
            {
                ss.append(s.charAt(i));
            }
        }
//        System.out.println(ss);
        return ss.toString();
    }
}
