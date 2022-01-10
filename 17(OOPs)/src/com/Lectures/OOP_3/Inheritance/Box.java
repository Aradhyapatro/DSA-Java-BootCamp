package com.Lectures.OOP_3.Inheritance;

class Box {
    int l;
    int b;
    int h;

    public Box() {

        super();

        this.l = -1;
        this.b = -1;
        this.h = -1;
        System.out.println("Invisible box");
    }

    public Box(int l, int b, int h) {
        this.l = l;
        this.b = b;
        this.h = h;
    }

    //        cube
    Box(double d) {
        this.b = (int) d;
        this.h = (int) d;
        this.l = (int) d;
    }

    Box(Box old) {
        this.l = old.l;
        this.b = old.b;
        this.h = old.h;
    }

    public void info() {
        System.out.println("Running the Box");
    }
}