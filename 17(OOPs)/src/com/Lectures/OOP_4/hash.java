package com.Lectures.OOP_4;

import java.util.Objects;

public class hash extends A{
    int num;


    public hash(int num) {
        super(12,"arya");
        this.num = num;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        hash hash = (hash) o;
        return num == hash.num;
    }

    @Override
    public int hashCode() {
        return Objects.hash(num);
    }

    public static void main(String[] args) {
        hash h=new hash(34);
        hash h1=new hash(34);
        System.out.println(h.hashCode()+" "+h1.hashCode());
        System.out.println(h.getClass().getName());
    }
}
