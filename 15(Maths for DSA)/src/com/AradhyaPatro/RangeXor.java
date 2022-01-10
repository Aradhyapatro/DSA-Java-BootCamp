package com.AradhyaPatro;

public class RangeXor {
    public static void main(String[] args) {
        int a=3;
        int b=9;

        a=XOR(a-1);
        b=XOR(b);
        System.out.println(a^b);
    }

    private static int XOR(int i) {
        if(i%4==0){
            return i;
        }else if(i%4==1){
            return 1;
        }else if(i%4==2){
            return i+1;
        }else{
            return 0;
        }
    }


}
