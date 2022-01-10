package com.AradhyaPatro;

public class FindUniqueNumber {
    public static void main(String[] args) {
        int[] arr={-1,-1,-2,-3,-4,-3,-4,-1,-1,-2,-89,-89,88};
        System.out.println(unique(arr));
    }

    private static int unique(int[] arr) {
        int x=arr[0];
        for (int i = 1; i < arr.length; i++) {
            x=x^arr[i];
        }
        return x;
    }
}
