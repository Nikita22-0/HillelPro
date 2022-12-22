package com.hillel.pashchenko.lesson29.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "accounts")
@Setter
@Getter
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int client_id;
    private String number;
    private double value;

    @Override
    public String toString() {
        return "Account: " +
                "id - " + id +
                ", client_id - " + client_id +
                ", number - " + number +
                ", value - " + value;
    }
}
