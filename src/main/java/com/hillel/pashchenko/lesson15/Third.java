package com.hillel.pashchenko.lesson15;

public interface Third {
    default void method(){
        System.out.println("Default third method");
    }
    static void staticMethod(){
        System.out.println("Third static method in third interface");
    }
    void firstContractMethod();
    void secondContractMethod();

}
