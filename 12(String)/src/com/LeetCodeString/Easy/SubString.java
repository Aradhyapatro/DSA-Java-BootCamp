package com.LeetCodeString.Easy;

import java.util.ArrayList;

public class SubString {
    public static void main(String[] args) {
        String[] arr=new String[]{"a","abc","bc","d"};
        System.out.println(sub(arr,"abc"));
    }

    public static int sub(String[] patterns,String word){
        ArrayList<String> arr=new ArrayList<>(word.length());
        for (int d = 0; d < word.length(); d++) {
            for (int i = word.length()-1; i >= d; i--) {
                arr.add(word.substring(d,i+1));
            }
            arr.add(word.substring(d,d+1));
        }
        System.out.println(arr.toString());

        int c=0;
        for(int j=0;j<patterns.length;j++){
            for (int i = 0; i < arr.size(); i++) {
                if(patterns[j].equals(arr.get(i))){
                    c++;
                    i=arr.size();
                }
            }
        }
        return c;
    }
}
