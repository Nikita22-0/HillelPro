package com.hillel.pashchenko.lesson10.entity;

public class Client {
    String idClient;
    String surname;
    String idAccountClient;
    double sum;

    public Client() {
    }

    public Client(String idClient, String surname, String idAccountClient, double sum) {
        this.idClient = idClient;
        this.surname = surname;
        this.idAccountClient = idAccountClient;
        this.sum = sum;
    }

    public String getIdClient() {
        return idClient;
    }

    public void setIdClient(String idClient) {
        this.idClient = idClient;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getIdAccountClient() {
        return idAccountClient;
    }

    public void setIdAccountClient(String idAccountClient) {
        this.idAccountClient = idAccountClient;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }
}
