package com.hillel.pashchenko.lesson15;

public interface Fourth {
    default void method(){
        System.out.println("Default fourth method");
    }
    static void staticMethod(){
        System.out.println("Fourth static method in fourth interface");
    }
    void firstContractMethod();
    void secondContractMethod();
}
