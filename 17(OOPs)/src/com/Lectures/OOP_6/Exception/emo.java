package com.Lectures.OOP_6.Exception;

public class emo {
    public static void main(String[] args) throws Exception {
//        Main.divide(10,0);

        try{
            var i = 5;
            throw new MyException("Aradhya");
        }catch (MyException n){
            System.out.println(n+" was found");
        }
    }
}
