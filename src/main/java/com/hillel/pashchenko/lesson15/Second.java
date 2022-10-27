package com.hillel.pashchenko.lesson15;

public interface Second {
    default void method(){
        System.out.println("Default second method");
    }
    static void staticMethod(){
        System.out.println("Second static method  in second interface");
    }
    void firstContractMethod();
    void secondContractMethod();

}
