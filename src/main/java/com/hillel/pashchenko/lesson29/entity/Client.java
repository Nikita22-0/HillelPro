package com.hillel.pashchenko.lesson29.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Table (name = "clients")
@Getter
@Setter
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

