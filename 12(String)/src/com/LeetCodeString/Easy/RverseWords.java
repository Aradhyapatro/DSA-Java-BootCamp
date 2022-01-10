package com.LeetCodeString.Easy;

public class RverseWords {
    public static void main(String[] args) {
        System.out.println(reverseWords("Hello nice to meet you"));
    }

    public static String reverseWords(String s) {
        s=s+" ";
        StringBuilder sent=new StringBuilder("");
        StringBuilder ss=new StringBuilder("");
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                ss.insert(0,s.charAt(i));
//                ss=s.charAt(i)+ss;
            }else{
                sent.append(ss);
                sent.append(" ");
                ss.replace(0,ss.length(),"");
            }
        }
        return sent.toString().trim();
    }
}
