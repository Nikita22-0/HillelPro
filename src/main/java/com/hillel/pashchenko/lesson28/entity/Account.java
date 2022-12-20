package com.hillel.pashchenko.lesson28.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Account {
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
