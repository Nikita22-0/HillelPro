package com.hillel.pashchenko.lesson29.dao;

import com.hillel.pashchenko.lesson29.entity.Status;
import com.hillel.pashchenko.lesson29.service.StatusService;
import com.hillel.pashchenko.lesson29.util.HibernateConfig;
import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class StatusDaoImpl implements StatusDao {
    final Logger logger = Logger.getLogger(StatusService.class);
    @Override
    public void save(Status status) {
        final SessionFactory sessionFactory = HibernateConfig.getSessionFactory();
        final Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();

        session.save(status);
        logger.debug(status);

        transaction.commit();
        session.close();
    }

    @Override
    public void update(Status status) {
        final SessionFactory sessionFactory = HibernateConfig.getSessionFactory();
        final Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();

        session.update(status);
        logger.debug(status);

        transaction.commit();
        session.close();
    }

    @Override
    public void delete(Status status) {
        final SessionFactory sessionFactory = HibernateConfig.getSessionFactory();
        final Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();

        session.delete(status);
        logger.debug(status);

        transaction.commit();
        session.close();
    }

    @Override
    public Status getById(int id) {
        final SessionFactory sessionFactory = HibernateConfig.getSessionFactory();
        final Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();

        final Status status = session.get(Status.class, id);
        logger.debug(id);

        transaction.commit();
        session.close();

        return status;
    }

    public void checkStatus(final Status status) {
        final StatusService statusService = new StatusService();
        logger.debug(status.toString());
        statusService.checkStatus(status);
    }
}
