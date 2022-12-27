package com.hillel.pashchenko.lesson31.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;


@Entity
@Table(name = "clients")
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

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "account_id")
    private Account account;

    @OneToMany(mappedBy = "client", fetch = FetchType.EAGER)
    private Set<Status> statusesID;

    @ManyToMany
    @JoinTable(
            name = "client_status",
            joinColumns = {@JoinColumn(name = "client_id")},
            inverseJoinColumns = {@JoinColumn(name = "status_id")}
    )
    private Set<Status> statuses;


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

