package com.hillel.pashchenko.lesson4.chain1;

import com.hillel.pashchenko.lesson4.interfaceCase.WorkTime;

public abstract class Grandfather implements WorkTime {
    int age;
    String surname;

    public Grandfather() {
    }

    public Grandfather(int age, String surname) {
        this.age = age;
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public abstract void move();
}
