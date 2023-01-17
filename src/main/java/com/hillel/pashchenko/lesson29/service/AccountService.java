package com.hillel.pashchenko.lesson29.service;

import com.hillel.pashchenko.lesson29.dao.AccountDao;
import com.hillel.pashchenko.lesson29.dao.AccountDaoImpl;
import com.hillel.pashchenko.lesson29.entity.Account;
import org.apache.log4j.Logger;

public class AccountService {
    private final AccountDao accountDao = new AccountDaoImpl();
    private final Logger logger = Logger.getLogger(AccountService.class);

    public void save(Account account) {
        logger.info(account);
        if (account == null) {
            logger.error("Account is null");
        }
        accountDao.save(account);
    }

    public void update(Account account) {
        logger.info(account);
        if (account == null) {
            logger.error("Account is null");
        }
        accountDao.update(account);
    }

    public void delete(Account account) {
        logger.info(account);
        if (account == null) {
            logger.error("Account is null");
        }
        accountDao.delete(account);
    }

    public Account getById(int id) {
        logger.info(id);
        if (id == 0) {
            logger.error("Id is null");
        }
        return accountDao.getById(id);
    }

    public void checkAccount(Account account) {
        logger.debug(account.toString());
    }
}
