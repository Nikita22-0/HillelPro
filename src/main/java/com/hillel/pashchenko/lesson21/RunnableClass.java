package com.hillel.pashchenko.lesson21;

public class RunnableClass implements Runnable{
    @Override
    public void run() {
        Thread.currentThread().setName("Runnable flow");
        for (int i = 0; i < 1000; i++) {
            AdditionalClass.methodForNum();
        }
    }
}
