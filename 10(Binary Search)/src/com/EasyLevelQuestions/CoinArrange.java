package com.EasyLevelQuestions;

public class CoinArrange {
    public static void main(String[] args) {
        System.out.println(Coin(5));
    }

    private static int Coin(int n) {
        int row=1,c=0;
        while(n>=row){
            n=n-row;
            row++;
            c++;
        }
        return c;
    }
}
