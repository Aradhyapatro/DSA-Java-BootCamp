package com.Lectures.OOP_6.Compare;

public class Student implements Comparable<Student>{
    String name;
    int marks;

    public Student(String name,int marks) {
        this.marks = marks;
        this.name=name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student s) {
        return this.marks-s.marks;
    }
}
