package com.hillel.pashchenko.lesson31.entity;

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
    @Column(name = "client_id")
    private int clientId;
    private String number;
    private double value;

    @OneToOne(mappedBy = "account")
    private Client client;

    @Override
    public String toString() {
        return "Account: " +
                "id - " + id +
                ", client id - " + clientId +
                ", number - " + number +
                ", value - " + value;
    }
}
