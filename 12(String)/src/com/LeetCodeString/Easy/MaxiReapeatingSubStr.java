package com.LeetCodeString.Easy;

public class MaxiReapeatingSubStr {
    public static void main(String[] args) {
        System.out.println(maxRepeating("aaaba","aaaba"));
    }

    public static int maxRepeating(String sequence, String word) {
        int c=0;
        int limit=word.length();
        System.out.println(sequence.length()+" "+limit);
        if((sequence.length()-word.length())<0){
            return 0;
        }

        if ((sequence.length()-word.length())==0 && sequence.equals(word)){
            return 1;
        }else if((sequence.length()-word.length())==0){
            return 0;
        }

        for (int i = 0; i < (sequence.length()-(2*word.length())); i++) {
//        for (int i = 0; i < (sequence.length()-word.length()); i++) {
            if(sequence.substring(i,i+limit).equals(word)){
                c++;
            }
        }
        return c;
    }
}
