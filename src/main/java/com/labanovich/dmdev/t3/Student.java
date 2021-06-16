package com.labanovich.dmdev.t3;

public class Student implements Comparable<Student>{
    private String name;
    private String surName;
    private int age;
    private int mark;

    public Student(String name, String surName, int age, int mark) {
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(mark, o.mark);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", age=" + age +
                ", mark=" + mark +
                '}';
    }
}
