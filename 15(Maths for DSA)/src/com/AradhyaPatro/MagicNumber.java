package com.AradhyaPatro;

public class MagicNumber {
    public static void main(String[] args) {
        int n=10;

        int ans=0;

        int p=1;
        while(n>0){
            ans+=(n&1)*Math.pow(5,p);
            p++;
            n=n>>1;
        }

        System.out.println(ans);
    }
}
