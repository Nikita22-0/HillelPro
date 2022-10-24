package com.hillel.pashchenko.lesson4.chain2;

import com.hillel.pashchenko.lesson4.interfaceCase.InstinctCont;
import com.hillel.pashchenko.lesson4.interfaceCase.LatinName;

public abstract class Bird implements InstinctCont, LatinName {

    String wing;
    String beak;

    public Bird() {
    }

    public Bird(String wing, String beak) {
        this.wing = wing;
        this.beak = beak;
    }

    public String getWing() {
        return wing;
    }

    public void setWing(String wing) {
        this.wing = wing;
    }

    public String getBeak() {
        return beak;
    }

    public void setBeak(String beak) {
        this.beak = beak;
    }

    public abstract void go();
}
