package com.hillel.pashchenko.lesson3;

public class Admin extends User{

    public Admin() {
    }

    public Admin(String name) {
        super(name);
    }

    public Admin(String name, String surname) {
        super(name, surname);
    }

    public Admin(String name, String surname, String email) {
        super(name, surname, email);
    }

    public Admin(String name, String surname, String email, String password) {
        super(name, surname, email, password);
    }

    public Admin(String name, String surname, String email, String password, String sex) {
        super(name, surname, email, password, sex);
    }

    public Admin(String name, String surname, String email, String password, String sex, String country) {
        super(name, surname, email, password, sex, country);
    }
    public void delete(boolean isContains){
        if(isContains){
            Support.CONST = "";
        }
    }
}
