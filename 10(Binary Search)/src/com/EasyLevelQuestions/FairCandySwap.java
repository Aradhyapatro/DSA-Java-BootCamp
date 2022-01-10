package com.EasyLevelQuestions;

import java.util.Arrays;

public class FairCandySwap {
    public static void main(String[] args) {
        int[] AA={1,2,5};
        int[] BA={2,4};
        System.out.println(Arrays.toString(SwapingCandy(AA,BA)));
    }

    private static int[] SwapingCandy(int[] aa, int[] ba) {
//        Sum of candies alice has
        int suma=0;
        for (int i = 0; i < aa.length; i++) {
            suma+=aa[i];
        }

//        Sum of candies Bob has
        int sumb=0;
        for (int i = 0; i < ba.length; i++) {
            sumb+=ba[i];
        }

//        difference of sums
        int diff=Math.abs(suma-sumb);

//        store the array that is to be returned
        int[] temp={-1,-1};

//        finding the number of candy alice/bob will give
        for (int i = 0; i < aa.length; i++) {
            for (int j = 0; j < ba.length; j++) {
                if((sumb>=suma && aa[i]<ba[j]) && ((diff-(Math.abs(aa[i]-ba[j])))-1==0)){
                    return new int[]{aa[i],ba[j]};
                }
            }
        }

        return temp;
    }


}
