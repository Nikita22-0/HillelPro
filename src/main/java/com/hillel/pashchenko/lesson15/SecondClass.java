package com.hillel.pashchenko.lesson15;

public class SecondClass implements Third,Fourth{
    @Override
    public void method() {
        Third.super.method();
        Fourth.super.method();
    }

    @Override
    public void firstContractMethod() {
        System.out.println("First contract method in SecondClass");
    }

    @Override
    public void secondContractMethod() {
        System.out.println("Second contract method in SecondClass");
    }

}
