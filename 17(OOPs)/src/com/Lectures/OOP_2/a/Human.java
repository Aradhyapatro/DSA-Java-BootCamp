package com.Lectures.OOP_2.a;

public class Human {
    int age;
    String name;
    float IQ;
    boolean married;
    static long population;

    public static long getPopulation() {
        return population;
    }

    public static void setPopulation(long population) {
        Human.population = population;
    }

    public Human(int age, String name, float IQ, boolean married) {
        this.age = age;
        this.name = name;
        this.IQ = IQ;
        this.married = married;
        Human.population+=1;
    }

    @Override
    public String toString() {
        return "Human{\n" +
                "\tage=" + age +
                ", \n\tname='" + name + '\'' +
                ", \n\tIQ=" + IQ +
                ", \n\tmarried=" + married +
                "\n}";
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIQ(float IQ) {
        this.IQ = IQ;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public float getIQ() {
        return IQ;
    }

    public boolean isMarried() {
        return married;
    }
}
