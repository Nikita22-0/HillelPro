package com.hillel.pashchenko.lesson4.chain1;

public final class YoungerSon extends Father{
    String beauty;
    String fast;

    public YoungerSon() {
    }

    public YoungerSon(int age, String surname) {
        super(age, surname);
    }

    public YoungerSon(String beauty, String fast) {
        this.beauty = beauty;
        this.fast = fast;
    }

    public String getBeauty() {
        return beauty;
    }

    public void setBeauty(String beauty) {
        this.beauty = beauty;
    }

    public String getFast() {
        return fast;
    }

    public void setFast(String fast) {
        this.fast = fast;
    }

    public void run(){
        System.out.println("Runs");
    }

    @Override
    public void work() {
        System.out.println("Younger son works");
    }

    @Override
    public void move() {
        System.out.println("Younger son moves");
    }

    @Override
    public void relaxation() {
        System.out.println("Younger son is relaxation");
    }

    @Override
    public void hobby() {
        System.out.println("Younger son's hobby is running");
    }

    @Override
    public void jobTitle() {
        System.out.println("Younger son is athlete");
    }

    @Override
    public void studies() {
        System.out.println("Younger  son is studying");
    }
}
