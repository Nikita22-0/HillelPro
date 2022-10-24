package com.hillel.pashchenko.lesson4.chain1;

public final class EldestSon extends Father{
    String mind;
    double height;

    public EldestSon() {
    }

    public EldestSon(int age, String surname) {
        super(age, surname);
    }

    public EldestSon(String patronymic, String eyeColor) {
        super(patronymic, eyeColor);
    }

    public EldestSon(String mind, double height) {
        this.mind = mind;
        this.height = height;
    }

    public String getMind() {
        return mind;
    }

    public void setMind(String mind) {
        this.mind = mind;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void read(){
        System.out.println("Reads");
    }

    @Override
    public void work() {
        System.out.println("Elder son works");
    }

    @Override
    public void move() {
        System.out.println("Elder son moves");
    }

    @Override
    public void relaxation() {
        System.out.println("Elder son relaxation");
    }

    @Override
    public void hobby() {
        System.out.println("Eldest son's hobby is programming");
    }

    @Override
    public void jobTitle() {
        System.out.println("Elder son is teacher");
    }

    @Override
    public void studies() {
        System.out.println("Elder son is studying");
    }
}
