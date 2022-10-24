package com.hillel.pashchenko.lesson2;

public class Sofa {
    private double width;
    private double length;
    private double height;

    public Sofa(double width, double length, double height) {
        this.width = width;
        this.length = length;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
