package com.hillel.pashchenko.lesson29.dao;

import com.hillel.pashchenko.lesson29.entity.Account;
import com.hillel.pashchenko.lesson29.service.AccountService;
import com.hillel.pashchenko.lesson29.util.HibernateConfig;
import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class AccountDaoImpl implements AccountDao {
    final Logger logger = Logger.getLogger(AccountService.class);

    @Override
    public void save(Account account) {
        final SessionFactory sessionFactory = HibernateConfig.getSessionFactory();
        final Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();

        session.save(account);
        logger.debug(account);

        transaction.commit();
        session.close();
    }

    @Override
    public void update(Account account) {
        final SessionFactory sessionFactory = HibernateConfig.getSessionFactory();
        final Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();

        session.update(account);
        logger.debug(account);

        transaction.commit();
        session.close();
    }

    @Override
    public void delete(Account account) {
        final SessionFactory sessionFactory = HibernateConfig.getSessionFactory();
        final Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();

        session.delete(account);
        logger.debug(account);

        transaction.commit();
        session.close();
    }

    @Override
    public Account getById(int id) {
        final SessionFactory sessionFactory = HibernateConfig.getSessionFactory();
        final Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();

        final Account account = session.get(Account.class, id);
        logger.debug(id);

        transaction.commit();
        session.close();

        return account;
    }

    public void checkAccount(final Account account) {
        final AccountService accountService = new AccountService();
        logger.debug(account.toString());
        accountService.checkAccount(account);
    }
}
