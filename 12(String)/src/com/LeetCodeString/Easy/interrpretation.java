package com.LeetCodeString.Easy;

public class interrpretation {
    public static void main(String[] args) {
        System.out.println(inter("g()(al)"));
    }

    public static String inter(String s)
    {
        StringBuilder ss=new StringBuilder("");
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='(' && s.charAt(i+1)=='a'){
                ss.append("al");
                i=i+3;
            }
            else if(s.charAt(i)=='(' && s.charAt(i+1)==')'){
                ss.append('o');
                i++;
            }
            else{
                ss.append('g');
            }
        }
        return ss.toString();
    }
}
