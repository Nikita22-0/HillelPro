package com.hillel.pashchenko.lesson2;

public class Chair {
    private int numberOfLegs;
    private double height;

    public Chair(int numberOfLegs, double height) {
        this.numberOfLegs = numberOfLegs;
        this.height = height;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
