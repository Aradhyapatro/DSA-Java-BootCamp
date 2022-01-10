package com.Lectures.OOP_6.Compare;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Student arya=new Student("Aradhya Patro",99);
        Student kunal=new Student("Kunal Khuswaha",100);
        Student arpit=new Student("aprit mukherjee",96);
        Student devi=new Student("Devi Prasad",97);

        Student[] list={arya,kunal,arpit,devi};
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));

        if(arya.compareTo(kunal)>0){
            System.out.println(arya.name+" has more marks");
        }else{
            System.out.println(kunal.name+" has more marks");
        }
    }

}
