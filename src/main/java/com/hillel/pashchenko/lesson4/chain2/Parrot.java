package com.hillel.pashchenko.lesson4.chain2;

public final class Parrot extends Flying {

    String color;
    int finger;

    public Parrot() {
    }

    public Parrot(String wing, String beak) {
        super(wing, beak);
    }

    public Parrot(int speed, int wingspan) {
        super(speed, wingspan);
    }

    public Parrot(String color, int finger) {
        this.color = color;
        this.finger = finger;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getFinger() {
        return finger;
    }

    public void setFinger(int finger) {
        this.finger = finger;
    }

    public void voice(){
        System.out.println("Parrot repeats a phrase");
    }

    @Override
    public void go() {
        System.out.println("Parrot goes");
    }

    @Override
    public void fly() {
        System.out.println("Parrot flies");
    }

    @Override
    public void nest() {
        System.out.println("Parrot nests");
    }

    @Override
    public void multiply() {
        System.out.println("Parrot breeds");
    }

    @Override
    public void hatchEggs() {
        System.out.println("Parrot hatching eggs");
    }

    @Override
    public void sing() {
        System.out.println("Parrot sings");
    }

    @Override
    public void latinName() {
        System.out.println("Psittaciformes");
    }
}
