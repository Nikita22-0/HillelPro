package com.hillel.pashchenko.lesson4.chain1;

public abstract class Father extends Grandfather {
    String patronymic;
    String eyeColor;

    public Father() {
    }

    public Father(int age, String surname) {
        super(age, surname);
    }

    public Father(String patronymic, String eyeColor) {
        this.patronymic = patronymic;
        this.eyeColor = eyeColor;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public abstract void work();
}
