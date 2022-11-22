package com.hillel.pashchenko.lesson21;

public class ThreadClass extends Thread{
    @Override
    public void run() {
        Thread.currentThread().setName("Thread flow");
        for (int i = 0; i < 1000; i++) {
            AdditionalClass.methodForNum();
        }
    }
}
