package com.hillel.pashchenko.lesson18;

public class User {
    Integer num;

    public User(Integer num) {
        this.num = num;
    }
    public static Integer parse(String s) {
        return Integer.valueOf(s);
    }

    public Integer sign(int s) {
        return Integer.signum(s);
    }
}
