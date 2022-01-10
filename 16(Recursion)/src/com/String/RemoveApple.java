package com.String;

public class RemoveApple {
    public static void main(String[] args) {
        String s="asbckahsvbcjh//apple//djabksdb";
        System.out.println(del(s));
    }

    private static String del(String s) {
        if(s.length()==1){
            return s;
        }

        if(s.startsWith("apple")){
            return del(s.substring(5));
        }
        return s.charAt(0)+del(s.substring(1));
    }
}
