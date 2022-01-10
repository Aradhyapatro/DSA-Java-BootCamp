package com.AradhyaPatro;

import java.util.ArrayList;

public class CeilingOfGivenNumber {
    public static void main(String[] args) {
        char[] c={'e','e','e','e','e','e','n','n','n','n'};
        System.out.println(nextGreatestLetter(c,'e'));
    }

    public static char nextGreatestLetter(char[] letters, char target) {
        int start=0;
        int end=letters.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(letters[mid]==target){
//                return letters[((mid+1) % letters.length)];
                start=mid+1;
                continue;
            }
            else if(letters[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return letters[(start % letters.length)];
    }
}
