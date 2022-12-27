package com.hillel.pashchenko.lesson31.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

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

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "client_id")
    private Client client;

    @ManyToMany(mappedBy = "statuses")
    private Set<Client> clients;

    @Override
    public String toString() {
        return "Status: " +
                "id - " + id +
                ", alias - " + alias +
                ", description - " + description;
    }
}
