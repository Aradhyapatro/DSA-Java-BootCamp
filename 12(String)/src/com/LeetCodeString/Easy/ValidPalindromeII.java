package com.LeetCodeString.Easy;

public class ValidPalindromeII {
    public static void main(String[] args) {
        System.out.println(helper("deeee",0,4,true));
    }

    private static boolean helper(String s,int start,int end,boolean flag) {
        //if both the pointers are at the same loc then things are cool.
        if(start>=end)return true;
        //iterate over the string
        while(start<=end){
            //if the characters match then move both the pointers
            if(s.charAt(start)==s.charAt(end)){
                start++; end--;
            }
            //otherwise check if you have chance of skipping the character then you do so and see both ways
            else if(!flag) return helper(s, start, end-1, true)|| helper(s, start+1, end, true);
                //if you have already skipped then the output is false
            else return false;
        }


        return true;
    }
}
