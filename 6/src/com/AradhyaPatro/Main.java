package com.AradhyaPatro;

import java.util.Scanner;

public class Main {

    public static void change(String[] arr, int i) {
        String s = arr[i];
        if (s.length() == 15) {
            return;
        } else {
            int l = 15 - s.length();
            for (int j = 0; j < l; j++) {
                s = s + ' ';
            }
        }
        arr[i] = s;
    }

    public static int numberOfZero(int x) {
        String s = Integer.toString(x);
        int length = s.length();
        return length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String arr[] = new String[3];
        int n[] = new int[3];

        for (int i = 0; i < 3; i++) {
            arr[i] = sc.next();
            change(arr, i);
            n[i] = sc.nextInt();
            //Complete this line
        }
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            System.out.print(arr[i]);
            int n1 = numberOfZero(n[i]);
            if (n1 == 3)
                System.out.println(n[i]);
            else if (n1 == 2)
                System.out.println("0" + n[i]);
            else
                System.out.println("00" + n[i]);
        }
        System.out.println("================================");


    }
}
