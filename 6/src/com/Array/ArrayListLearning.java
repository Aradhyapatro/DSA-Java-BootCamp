package com.Array;

import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListLearning {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=Integer.MIN_VALUE;
        ArrayList<Integer> list = new ArrayList<Integer>(9);
        int n1 = sc.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
            if(list.contains(9))
                break;
        }
        System.out.println(list);


    }
}
