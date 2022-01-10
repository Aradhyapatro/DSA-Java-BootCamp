package com.AradhyaPatro;

public class findSingleinOddnumberOfNumbers {
    public static void main(String[] args) {
        int[] arr={2,2,7,7,19,7,2,4,4,4,5,5,5};
        int num=0;
        for (int i = 0; i < arr.length; i++) {
            int l=0;
            while(arr[i]>0){
                num+=(arr[i]&1)*Math.pow(10,l);
                l++;
                arr[i] = arr[i] >> 1;
            }
        }
//        System.out.println(num);
        int n=0;
        int c=0;
        while(num>0){
            n+=((num%10)%3)*Math.pow(10,c);
            c++;
            num=num/10;
        }
        int ans=0;
        c=0;
        while(n>0){
            ans+=(n&1)*Math.pow(2,c);
            c++;
            n=n/10;
        }
        System.out.println(ans);
    }
}
