package com.hillel.pashchenko.lesson29.service;

import com.hillel.pashchenko.lesson29.dao.ClientDao;
import com.hillel.pashchenko.lesson29.dao.ClientDaoImpl;
import com.hillel.pashchenko.lesson29.entity.Client;
import org.apache.log4j.Logger;


public class ClientService {

    private final ClientDao clientDao = new ClientDaoImpl();
    private final Logger logger = Logger.getLogger(ClientService.class);

    public void save(Client client) {
        if (client == null){
            logger.error("Client is null");
        }
        clientDao.save(client);
    }

    public void update(Client client) {
        if (client == null){
            logger.error("Client is null");
        }
        clientDao.update(client);
    }

    public void delete(Client client) {
        if (client == null){
            logger.error("Client is null");
        }
        clientDao.delete(client);
    }

    public Client getById(int id) {
        return clientDao.getById(id);
    }

    public Client getByPhone(int phone) {
        return clientDao.getByPhone(phone);
    }

    public void checkClient(Client client) {
        logger.debug(client.toString());
    }
}
