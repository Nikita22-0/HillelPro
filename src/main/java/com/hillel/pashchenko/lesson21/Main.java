package com.hillel.pashchenko.lesson21;

import java.util.concurrent.FutureTask;

public class Main {
    public static void main(String[] args) {
        final ThreadClass threadClass = new ThreadClass();
        threadClass.start();

        final RunnableClass runnableClass = new RunnableClass();
        final Thread threadRun = new Thread(runnableClass);
        threadRun.start();

        final CallableClass callableClass = new CallableClass();
        final FutureTask<String> stringFutureTask = new FutureTask<>(callableClass);
        final Thread threadCall = new Thread(stringFutureTask);
        threadCall.start();

    }
}
/**/
