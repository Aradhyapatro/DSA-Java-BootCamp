package com.Lectures.OOP_6.Exception;

public class Main {
    public static void main(String[] args) {
        try{
            int[] arr=new int[3];
//            System.out.println(arr[5]);
            System.out.println((divide(5,0)));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("I am finally learning something fruitfull");
        }
    }

    public static int divide(int a, int b) throws Exception {
        if(b==0){
            throw new Exception("Aradhya I told you not to divid By Zero");
        }

        return a/b;
    }
}
