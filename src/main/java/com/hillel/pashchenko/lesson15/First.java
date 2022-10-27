package com.hillel.pashchenko.lesson15;

public interface First {
    default void method(){
        System.out.println("Default first method");
    }
    static void staticMethod(){
        System.out.println("First static method in first interface");
    }
    void firstContractMethod();
    void secondContractMethod();

}
