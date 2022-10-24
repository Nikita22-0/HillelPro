package com.hillel.pashchenko.lesson3;


public class Support extends User {

    public static String CONST = """
            И труд нелеп, и бестолкова праздность,
            И с плеч долой всё та же голова,
            Когда приходит бешеная ясность,
            Насилуя притихшие слова.
                        """;

    public Support() {
    }

    public Support(String name) {
        super(name);
    }

    public Support(String name, String surname) {
        super(name, surname);
    }

    public Support(String name, String surname, String email) {
        super(name, surname, email);
    }

    public Support(String name, String surname, String email, String password) {
        super(name, surname, email, password);
    }

    public Support(String name, String surname, String email, String password, String sex) {
        super(name, surname, email, password, sex);
    }

    public Support(String name, String surname, String email, String password, String sex, String country) {
        super(name, surname, email, password, sex, country);
    }

    public String getCONST() {
        return CONST;
    }


    public boolean check(String text) {
        return CONST.contains(text);
    }

}
