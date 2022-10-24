package com.hillel.pashchenko.lesson14;

import java.util.ArrayList;
import java.util.Map;


public class Main {
    public static void main(String[] args) {
        final InitializationData initializationData = new InitializationData();
        final Information information = new Information();
        initializationData.giveAndFillCollections(information);
        final ArrayList<Integer> list = new ArrayList<>();
        for (int i = 31; i < 37; i++) {
            list.add(i);
        }
        workWithArrayList(information, list);
        System.out.println(information.getNickname());
        for (String mail : information.getMail()) {
            System.out.println(mail);
        }
        System.out.println(information.getMail().size());
        for (Map.Entry<String, String> entry : information.getAccount().entrySet())
            System.out.println(entry.getKey() + " - " + entry.getValue());
    }

    public static Information workWithArrayList(Information information, ArrayList<Integer> list) {
        for (Integer integer : list) {
            information.getNickname().add(String.valueOf(integer));
            if(!(information.getMail().contains(String.valueOf(integer).concat("@gmail.com")))) {
                information.getMail().add(String.valueOf(integer).concat("@gmail.com"));
            }
            information.getAccount().put(String.valueOf(integer).concat("@gmail.com"), String.valueOf(integer));
        }
        return information;
    }
}
