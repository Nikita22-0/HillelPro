package com.hillel.pashchenko.lesson4;

import com.hillel.pashchenko.lesson4.chain1.EldestSon;
import com.hillel.pashchenko.lesson4.chain1.MiddleSon;
import com.hillel.pashchenko.lesson4.chain1.YoungerSon;
import com.hillel.pashchenko.lesson4.chain2.Crow;
import com.hillel.pashchenko.lesson4.chain2.Parrot;
import com.hillel.pashchenko.lesson4.chain2.Pigeon;

public class Main {
    public static void main(String[] args) {
        EldestSon eldestSon = new EldestSon();
        MiddleSon middleSon = new MiddleSon();
        YoungerSon youngerSon = new YoungerSon();
        Crow crow = new Crow();
        Pigeon pigeon = new Pigeon();
        Parrot parrot = new Parrot();
        //Интерфейсы не создавал так как для этого нужно переопределить их методы прямо здесь,
        // а так как я их уже переопределил в классах, то это бессмысленно
        eldestSon.setAge(30);
        eldestSon.setSurname("Ivanenko");
        eldestSon.setPatronymic("Vladislavovich");
        eldestSon.setEyeColor("Blue");
        eldestSon.setMind("Very Smart");
        eldestSon.setHeight(1.85);
        eldestSon.read();
        eldestSon.work();
        eldestSon.move();
        eldestSon.relaxation();
        eldestSon.hobby();
        eldestSon.jobTitle();
        eldestSon.studies();
        System.out.println();

        middleSon.setAge(30);
        middleSon.setSurname("Ivanenko");
        middleSon.setPatronymic("Vladislavovich");
        middleSon.setEyeColor("Blue");
        middleSon.setStrength("Very Strength");
        middleSon.setCourage("Courage");
        middleSon.workout();
        middleSon.work();
        middleSon.move();
        middleSon.relaxation();
        middleSon.hobby();
        middleSon.jobTitle();
        middleSon.studies();
        System.out.println();

        youngerSon.setAge(30);
        youngerSon.setSurname("Ivanenko");
        youngerSon.setPatronymic("Vladislavovich");
        youngerSon.setEyeColor("Blue");
        youngerSon.setBeauty("Beautiful");
        youngerSon.setFast("Very fast");
        youngerSon.run();
        youngerSon.work();
        youngerSon.move();
        youngerSon.relaxation();
        youngerSon.hobby();
        youngerSon.jobTitle();
        youngerSon.studies();
        System.out.println();

        crow.setWing("Large");
        crow.setBeak("Black");
        crow.setSpeed(50);
        crow.setWingspan(150);
        crow.setHeight(78);
        crow.setWeight(2);
        crow.eat();
        crow.go();
        crow.fly();
        crow.nest();
        crow.multiply();
        crow.hatchEggs();
        crow.sing();
        crow.latinName();
        System.out.println();

        pigeon.setWing("Large");
        pigeon.setBeak("Black");
        pigeon.setSpeed(150);
        pigeon.setWingspan(70);
        pigeon.setNavigation("Good navigation");
        pigeon.setVision("Good vision");
        pigeon.nods();
        pigeon.go();
        pigeon.fly();
        pigeon.nest();
        pigeon.multiply();
        pigeon.hatchEggs();
        pigeon.sing();
        pigeon.latinName();
        System.out.println();

        parrot.setWing("Large");
        parrot.setBeak("Black");
        parrot.setSpeed(120);
        parrot.setWingspan(35);
        parrot.setColor("Green");
        parrot.setFinger(4);
        parrot.voice();
        parrot.go();
        parrot.fly();
        parrot.nest();
        parrot.multiply();
        parrot.hatchEggs();
        parrot.sing();
        parrot.latinName();
        System.out.println();
    }
}
