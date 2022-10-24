package com.hillel.pashchenko.lesson4.chain1;

public final class MiddleSon extends Father{
    String strength;
    String courage;

    public MiddleSon() {
    }

    public MiddleSon(int age, String surname) {
        super(age, surname);
    }

    public MiddleSon(String strength, String courage) {
        this.strength = strength;
        this.courage = courage;
    }

    public String getStrength() {
        return strength;
    }

    public void setStrength(String strength) {
        this.strength = strength;
    }

    public String getCourage() {
        return courage;
    }

    public void setCourage(String courage) {
        this.courage = courage;
    }

    public void workout(){
        System.out.println("Trains");
    }

    @Override
    public void work() {
        System.out.println("Middle son woks");
    }

    @Override
    public void move() {
        System.out.println("Middle son moves");
    }

    @Override
    public void relaxation() {
        System.out.println("Middle son is relaxation");
    }

    @Override
    public void hobby() {
        System.out.println("Middle son's hobby is box");
    }

    @Override
    public void jobTitle() {
        System.out.println("Middle son is security");
    }

    @Override
    public void studies() {
        System.out.println("Middle son is studying");
    }
}
