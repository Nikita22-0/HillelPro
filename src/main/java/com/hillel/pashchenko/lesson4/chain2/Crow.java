package com.hillel.pashchenko.lesson4.chain2;

public final class Crow extends Flying {

    int height;
    int weight;

    public Crow() {
    }

    public Crow(String wing, String beak) {
        super(wing, beak);
    }

    public Crow(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void eat(){
        System.out.println("Crow eats");
    }

    @Override
    public void go() {
        System.out.println("Crow goes");
    }

    @Override
    public void fly() {
        System.out.println("Crow flies");
    }

    @Override
    public void nest() {
        System.out.println("Crow nests");
    }

    @Override
    public void multiply() {
        System.out.println("Crow breeds");
    }

    @Override
    public void hatchEggs() {
        System.out.println("Crow hatching eggs");
    }

    @Override
    public void sing() {
        System.out.println("Crow croaks");
    }

    @Override
    public void latinName() {
        System.out.println("Corvus");
    }
}
