package com.hillel.pashchenko.lesson29.dao;

import com.hillel.pashchenko.lesson29.entity.Client;
import com.hillel.pashchenko.lesson29.service.ClientService;
import com.hillel.pashchenko.lesson29.util.HibernateConfig;
import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class ClientDaoImpl implements ClientDao {

    private final String QUERY_BY_PHONE = "from Client where phone = :phone";

    final Logger logger = Logger.getLogger(ClientService.class);

    @Override
    public void save(Client client) {
        final SessionFactory sessionFactory = HibernateConfig.getSessionFactory();
        final Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();

        session.save(client);
        logger.debug(client);

        transaction.commit();
        session.close();
    }

    @Override
    public void update(Client client) {
        final SessionFactory sessionFactory = HibernateConfig.getSessionFactory();
        final Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();

        session.update(client);
        logger.debug(client);

        transaction.commit();
        session.close();
    }

    @Override
    public void delete(Client client) {
        final SessionFactory sessionFactory = HibernateConfig.getSessionFactory();
        final Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();

        session.delete(client);
        logger.debug(client);

        transaction.commit();
        session.close();
    }

    @Override
    public Client getById(int id) {
        final SessionFactory sessionFactory = HibernateConfig.getSessionFactory();
        final Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();

        final Client client = session.get(Client.class, id);
        logger.debug(id);

        transaction.commit();
        session.close();

        return client;
    }

    @Override
    public Client getByPhone(int phone) {
        final SessionFactory sessionFactory = HibernateConfig.getSessionFactory();
        final Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();

        final Query query = session.createQuery(QUERY_BY_PHONE);
        query.setParameter("phone", phone);
        final Client client = (Client) query.getSingleResult();
        logger.debug(phone);

        transaction.commit();
        session.close();

        return client;
    }

    public void checkClient(final Client client) {
        final ClientService clientService = new ClientService();
        logger.debug(client.toString());
        clientService.checkClient(client);
    }
}
