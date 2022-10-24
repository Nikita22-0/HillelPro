package com.hillel.pashchenko.lesson9;

public class Main {
    public static void main(String[] args) {
        StringHelper stringHelper = new StringHelper();
        stringHelper.workWithString("   mainn   ", new char[]{'c', 'C', 'L', 'A', 'S', 's'});
        System.out.println();
        SupportClass supportClass = new SupportClass();
        supportClass.numberPhone("+38(050)6164503");
        supportClass.email("vasiliev43@gmail.com");
        supportClass.dateBirthday("05.08.1995");
    }
}
