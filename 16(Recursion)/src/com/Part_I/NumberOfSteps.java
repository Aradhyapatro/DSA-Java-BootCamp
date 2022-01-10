package com.Part_I;

public class NumberOfSteps {

    public static void main(String[] args) {
        int n = 100;
        System.out.println(steps(n,0));
    }

    private static int steps(int n,int c) {
        if(n==0){
            return c;
        }

        c++;
        if(n%2==0){
            return steps(n/2,c);
        }else{
            return steps(n-1,c);
        }
    }
}
