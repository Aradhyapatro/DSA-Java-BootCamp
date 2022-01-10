package com.AradhyaPatro;

public class Recursive {
    public static void main(String[] args) {
        print(1);
    }

    private static void print(int i) {
        System.out.println(i);
        if(i>9){
            return;
        }
        print(i+1);
    }


}
