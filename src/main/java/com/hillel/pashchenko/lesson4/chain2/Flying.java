package com.hillel.pashchenko.lesson4.chain2;

public abstract class Flying extends Bird {

    int speed;
    int wingspan;

    public Flying() {
    }

    public Flying(String wing, String beak) {
        super(wing, beak);
    }

    public Flying(int speed, int wingspan) {
        this.speed = speed;
        this.wingspan = wingspan;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getWingspan() {
        return wingspan;
    }

    public void setWingspan(int wingspan) {
        this.wingspan = wingspan;
    }

    public abstract void fly();
}
