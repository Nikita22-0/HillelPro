package com.hillel.pashchenko.lesson29.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "statuses")
@Setter
@Getter
public class Status {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
