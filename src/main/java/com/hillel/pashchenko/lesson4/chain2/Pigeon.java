package com.hillel.pashchenko.lesson4.chain2;

public final class Pigeon extends Flying {

    String navigation;
    String vision;

    public Pigeon() {
    }

    public Pigeon(String navigation, String vision) {
        this.navigation = navigation;
        this.vision = vision;
    }

    public Pigeon(int speed, int wingspan) {
        super(speed, wingspan);
    }

    public String getNavigation() {
        return navigation;
    }

    public void setNavigation(String navigation) {
        this.navigation = navigation;
    }

    public String getVision() {
        return vision;
    }

    public void setVision(String vision) {
        this.vision = vision;
    }

    public void nods(){
        System.out.println("Pigeon nods");
    }

    @Override
    public void go() {
        System.out.println("Pigeon goes");
    }

    @Override
    public void fly() {
        System.out.println("Pigeon flies");
    }

    @Override
    public void nest() {
        System.out.println("Pigeon nests");
    }

    @Override
    public void multiply() {
        System.out.println("Pigeon breeds");
    }

    @Override
    public void hatchEggs() {
        System.out.println("Pigeon hatching eggs");
    }

    @Override
    public void sing() {
        System.out.println("Pigeon cooing");
    }

    @Override
    public void latinName() {
        System.out.println("Columba livia");
    }
}
