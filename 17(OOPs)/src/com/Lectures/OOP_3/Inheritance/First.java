package com.Lectures.OOP_3.Inheritance;

public class First {

    static class Box{
        int l;
        int b;
        int h;

        public Box() {
            this.l=-1;
            this.b=-1;
            this.h=-1;
            System.out.println("Invisible box");
        }

        public Box(int l, int b, int h) {
            this.l = l;
            this.b = b;
            this.h = h;
        }

//        cube
        Box(double d){
            this.b=(int)d;
            this.h=(int)d;
            this.l=(int)d;
        }

        Box(Box old){
            this.l=old.l;
            this.b=old.b;
            this.h=old.h;
        }

        public void info(){
            System.out.println("Running the Box");
        }
    }

    public static void main(String[] args) {
        First f=new First();
        f.king();
    }

    public void king(){
        Box b=new Box(12.3);
        System.out.println(b.h);
    }
}
