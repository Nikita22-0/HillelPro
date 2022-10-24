package com.hillel.pashchenko.lesson14;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class Information {
    private ArrayList<String> nickname;
    private LinkedHashSet<String> mail;
    private LinkedHashMap<String, String> account;


    public Information() {
        this.nickname = new ArrayList<>();
        this.mail = new LinkedHashSet <>();
        this.account = new LinkedHashMap <>();
    }

    public ArrayList<String> getNickname() {
        return nickname;
    }

    public void setNickname(ArrayList<String> nickname) {
        this.nickname = nickname;
    }

    public LinkedHashSet<String> getMail() {
        return mail;
    }

    public void setMail(LinkedHashSet<String> mail) {
        this.mail = mail;
    }

    public LinkedHashMap<String, String> getAccount() {
        return account;
    }

    public void setAccount(LinkedHashMap<String, String> account) {
        this.account = account;
    }
}