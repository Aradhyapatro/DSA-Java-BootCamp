package com.Part_II;

public class sqrt {
    public static void main(String[] args) {
        int n=40;
        int p=5;
        System.out.printf("%.8f",manualsqrt(n,p));
    }

    private static float manualsqrt(int n, int p) {
        int s=1;
        int e=n;

        float root=0.0f;

        while(s<=e){
            int m=s+(e-s)/2;
            if(m*m==n){
                return m;
            }else if(m*m>(n)){
                e=m-1;
            }else{
                s=m+1;
            }
        }

        root=e;

        float inc=0.1f;
        for (int i = 1; i <= p; i++) {

            while (root*root<=n){
                root+=inc;
            }
            root-=inc;
            inc/=10;
        }

        return root;
    }
}
