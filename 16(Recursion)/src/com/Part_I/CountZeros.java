package com.Part_I;

public class CountZeros {
    public static void main(String[] args) {
        int n=1002030;
        System.out.println(Counting(n,0));
    }

    private static int Counting(int n,int c) {
        if(n==0){
            return c;
        }

        if(n%10==0){
            return Counting(n/10,c+1);
        }

        return Counting(n/10,c);
    }

    private static int Count(int n) {
        if(n/10==0){
            if(n==0){
                return 1;
            }
            return 0;
        }

        int m;
        if(n%10==0){
            m=1;
        }else{
            m=0;
        }

        return m+Count(n/10);
    }
}
