package com.Part_II;

import java.util.ArrayList;
import java.util.Collections;

public class Prime {
    public static void main(String[] args) {
        int n=108;
        primeRange(n);
    }

    private static void primeRange(int n) {
        boolean[] arr=new boolean[n+1];

        for (int i = 2; i <= n; i++) {
            if(arr[i]==false && isPrime(i)) {
                System.out.print(i + " ");
                for (int j = (2*i); j <= n; j+=i) {
                    arr[j]=true;
                }
            }else{
                arr[i]=true;
            }
        }
    }

    private static boolean isPrime(int n) {
        if(n<=1){
            return false;
        }

        int c=2;
        while(c*c<=n){
            if(n%c==0){
                return false;
            }
            c++;
        }
        return true;
    }


}
