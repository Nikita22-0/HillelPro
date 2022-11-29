package com.hillel.pashchenko.lesson23;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockClass {
    static Lock lock = new ReentrantLock();
    public static void first(){
        lock.lock();
        System.out.print(Thread.currentThread().getName() + "First method, ");
    }
    public static void second(){
        System.out.print("second method, ");
    }
    public static void third(){
        System.out.println("third method.");
        lock.unlock();
    }

}
