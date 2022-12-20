package com.hillel.pashchenko.lesson28.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Client {
    private int id;
    private String name;
    private String email;
    private int phone;
    private String about;
    private int age;

    @Override
    public String toString() {
        return "Client: " +
                "id - " + id +
                ", name - " + name +
                ", email - " + email +
                ", phone - " + phone +
                ", about - " + about +
                ", age - " + age;
    }
}
