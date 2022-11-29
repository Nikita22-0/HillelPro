package com.hillel.pashchenko.lesson23;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    static AtomicInteger counter = new AtomicInteger(10000);
    static int count = 0;
    public static void main(String[] args) throws InterruptedException {
        threadPool();
        for (int i = 0; i < 3; i++) {
            final Thread thread = new Thread(() -> {
                count++;
                Thread.currentThread().setName("Lock thread " + count + ": " );
                LockClass.first();
                LockClass.second();
                LockClass.third();
            });
            thread.start();
        }
        deadlock();
    }
    public synchronized static void deadlock() {
            Thread thread = new Thread(Main::deadlock);
            thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public static void threadPool() throws InterruptedException {
        final ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(2);
        newFixedThreadPool.execute(() -> {
            for (int i = 0; i < 10000; i++) {
                final Thread thread = new Thread(() -> counter.decrementAndGet());
                thread.start();
            }
        });
        Thread.sleep(1000);
        newFixedThreadPool.shutdownNow();
        System.out.println(counter.get());
    }
}
