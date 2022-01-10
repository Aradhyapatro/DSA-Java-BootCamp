package com.Part_II;

public class NRM {
    public static void main(String[] args) {
        System.out.println(nrm(1000));
    }

    private static double nrm(int n) {
        double x=n;
        double root;

        while(true){
            root=0.5*(x+(n/x));

            if(Math.abs(root-x)<0.00000000000000001){
                return x;
            }

            x=root;
        }
    }
}
