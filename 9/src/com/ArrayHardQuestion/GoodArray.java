package com.ArrayHardQuestion;

public class GoodArray {
    public static void main(String[] args) {
        int[] a = {12, 5, 7, 23};
        System.out.println(isGoodArray(a));
    }

    public static boolean isGoodArray(int[] arr) {
        int result = arr[0];
        for (int i = 0; i < arr.length; i++) {
            result = GCD(result, arr[i]);
        }
        if (result == 1)
            return true;
        return false;
    }

    public static int GCD(int x, int y) {
        int gcd = 1;
        for (int i = 1; i <= x && i <= y; i++) {
            if (x % i == 0 && y % i == 0)
                gcd = i;
        }
        return gcd;
    }
}

