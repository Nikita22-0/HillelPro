package com.hillel.pashchenko.lesson15;

public class FirstClass implements First,Second{
    @Override
    public void method() {
        First.super.method();
        Second.super.method();
    }

    @Override
    public void firstContractMethod() {
        System.out.println("First contract method in FirstClass");
    }

    @Override
    public void secondContractMethod() {
        System.out.println("Second contract method in FirstClass");
    }
}
