package com.Lectures.OOP_1;

public class Main {
    public static void main(String[] args) {
        A a=new A(123,"Arya",92.2f);
        System.out.println(a);

        Integer a1=10;
        int aa=10;

        System.out.println(a1.hashCode());
    }
}

class A{
    int data;
    String name;
    float points;

    A(){
        data=10;
        name="Aradhya";
        points=10;
    }



    @Override
    public String toString() {
        return "A{" +
                "data=" + data +
                ", name='" + name + '\'' +
                ", points=" + points +
                '}';
    }

    A(int data,String name,float points){
        this.data=data;
        this.name=name;
        this.points=points;
    }

}
