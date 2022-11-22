package com.hillel.pashchenko.lesson21;

import java.util.concurrent.Callable;

public class CallableClass implements Callable {
    @Override
    public Object call() throws Exception {
        Thread.currentThread().setName("Callable flow");
        for (int i = 0; i < 1000; i++) {
            AdditionalClass.methodForNum();
        }
        return null;
    }
}
