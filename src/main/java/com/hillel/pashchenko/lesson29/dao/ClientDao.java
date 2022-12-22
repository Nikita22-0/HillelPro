package com.hillel.pashchenko.lesson29.dao;

import com.hillel.pashchenko.lesson29.entity.Client;
import org.hibernate.query.Query;

public interface ClientDao {

    void save(Client client);

    void update(Client client);

    void delete(Client client);

    Client getById(int id);

    Client getByPhone(int phone);
}
