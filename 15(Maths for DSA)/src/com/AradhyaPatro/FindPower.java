package com.AradhyaPatro;

public class FindPower {
    public static void main(String[] args) {
        int base=5;
        int power=5;

        int ans=1;
        while(power>0){
            if((power&1)==1){
                ans*=(power&1)*base;
            }

            base*=base;
            power=power>>1;
        }

        System.out.println(ans);
    }
}
