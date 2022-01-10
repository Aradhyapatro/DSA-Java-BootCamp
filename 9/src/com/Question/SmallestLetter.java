package com.Question;

public class SmallestLetter {
    public static void main(String[] args) {
     char[] cc={'a','e','i' };
        System.out.println(find(cc,'j'));
    }

    public static char find(char cc[],char c)
    {
        if(cc[cc.length-1]<c)
            return cc[0];
        int start = 0;
        int end = cc.length-1;
        while (start<=end)
        {
            int mid=start+(end-start)/2;
            if(cc[mid]==c)
                return cc[mid];
            else if(cc[mid]>c)
                end=mid-1;
            else
                start=mid+1;
        }
        return cc[start%cc.length];
    }
}
