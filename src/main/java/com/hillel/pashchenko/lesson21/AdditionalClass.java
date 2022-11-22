package com.hillel.pashchenko.lesson21;

public class AdditionalClass {
    static int num;

    public AdditionalClass() {
    }

    public AdditionalClass(int num) {
        AdditionalClass.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        AdditionalClass.num = num;
    }

    public static void methodForNum(){
        System.out.println(Thread.currentThread().getName() + " " + num);
        num++;
    }
}
