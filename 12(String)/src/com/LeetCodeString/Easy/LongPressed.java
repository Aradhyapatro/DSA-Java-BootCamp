package com.LeetCodeString.Easy;

public class LongPressed {
    public static void main(String[] args) {
        System.out.println(isLongPressedName("alex","aaleex"));
    }

    public static boolean isLongPressedName(String name, String typed) {
        int i=0,j=0;
        if(name.charAt(0)!=typed.charAt(0))
            return false;
        while(i<name.length() && j<typed.length()){
            if(name.charAt(i)==typed.charAt(j)){
                i++;
                j++;
            }
            else if(typed.charAt(j)==typed.charAt(j-1)){
                j++;
            }
            else{
                return false;
            }
        }

        if(i==name.length() && (typed.length()==j || sameCharac(typed,j))){
            return true;
        }
        else{
            return false;
        }

//        return true;
    }

    public static boolean sameCharac(String t,int j){
        char c=t.charAt(j-1);
        for(int k=j;k<t.length();k++){
            if(c!=t.charAt(k)){
                return false;
            }
        }
        return true;
    }
}
