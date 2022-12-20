package com.hillel.pashchenko.lesson28.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Status {
    private int id;
    private String alias;
    private String description;

    @Override
    public String toString() {
        return "Status: " +
                "id - " + id +
                ", alias - " + alias +
                ", description - " + description;
    }
}
