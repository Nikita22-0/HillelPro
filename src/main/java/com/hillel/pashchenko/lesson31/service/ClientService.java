package com.hillel.pashchenko.lesson31.service;

import com.hillel.pashchenko.lesson31.dao.ClientDao;
import com.hillel.pashchenko.lesson31.entity.Client;


public class ClientService {

    private final ClientDao clientDao = new ClientDao();

    public void save(Client client) {
        clientDao.save(client);
    }

    public void update(Client client) {
        clientDao.update(client);
    }

    public void delete(Client client) {
        clientDao.delete(client);
    }
}
