package com.LeetCodeString.Easy;

public class numberDecode {
    public static void main(String[] args) {
        System.out.println(decode("10#11#520#"));
    }

    public static String decode(String s){
        StringBuilder arr=new StringBuilder("");
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='#') {
//                if(arr.length()>2){
                    arr.delete(arr.length()-2,arr.length());
//                }
                int n=(int)(s.charAt(i-2));
                n=n-'0';
                int m=(int)s.charAt(i-1);
                m=m-'0';
                n=n*10+m;
                n=n+'a'-1;
                arr.append((char)n);

            }
            else {
                int n=(int)s.charAt(i);
                n=n-'0'+'a'-1;
                arr.append((char)n);
            }
        }
        return arr.toString();
    }
}
