package com.AradhyaPatro;

public class BinaryStringToNumberSum {
    public static void main(String[] args) {
        System.out.println(addBinary("11","1"));
    }

    public static int BintoNum(String s){
        int ans=0;
        int c=0;

        while(s!=""){
            if(s.charAt(s.length()-1)=='1'){
                ans+=Math.pow(2,c);
            }
            c++;
            s=s.substring(0,s.length()-1);
        }

        return ans;
    }

    public static String addBinary(String a, String b) {
        int n=BintoNum(a);
        int m=BintoNum(b);

        return Integer.toBinaryString(n+m);
    }
}
