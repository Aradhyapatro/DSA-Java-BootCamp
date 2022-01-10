package com.Lectures.OOP_5.Interfaces;

public class Car implements Engine,Brake,Media {
    public static void main(String[] args) {
        Car c= new Car();
        c.start();

    }

    @Override
    public void brake() {
        System.out.println("Brake like a normal Car");
    }

    @Override
    public void start() {
        System.out.println("Start like a normal Car");
    }

    @Override
    public void stop() {
        System.out.println("I stop like electric car");
    }

    @Override
    public void accelarate() {
        System.out.println("I accelerate like rocket");
    }
}
