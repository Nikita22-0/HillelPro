package com.hillel.pashchenko.lesson29.service;

import com.hillel.pashchenko.lesson29.dao.ClientDao;
import com.hillel.pashchenko.lesson29.dao.ClientDaoImpl;
import com.hillel.pashchenko.lesson29.entity.Client;


public class ClientService {

    private final ClientDao clientDao = new ClientDaoImpl();

    public void save(Client client){
        clientDao.save(client);
    }

    public void update(Client client){
        clientDao.update(client);
    }

    public void delete(Client client){
        clientDao.delete(client);
    }

    public Client getById(int id){
        return clientDao.getById(id);
    }

    public Client getByPhone(int phone){
        return clientDao.getByPhone(phone);
    }
}
