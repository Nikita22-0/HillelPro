package com.hillel.pashchenko.lesson10.service;

import com.hillel.pashchenko.lesson10.entity.Client;
import com.hillel.pashchenko.lesson10.util.Helper;


public class Transaction {
    public void transferOfMoney(Client client, String idAccountClient) {
        Helper helper = new Helper();
        helper.idAccountEquals(client.getIdAccountClient(), idAccountClient);
    }
}
