package com.hillel.pashchenko.lesson29.service;

import com.hillel.pashchenko.lesson29.dao.AccountDao;
import com.hillel.pashchenko.lesson29.dao.AccountDaoImpl;
import com.hillel.pashchenko.lesson29.entity.Account;

public class AccountService {
    private final AccountDao accountDao = new AccountDaoImpl();

    public void save(Account account){
        accountDao.save(account);
    }

    public void update(Account account){
        accountDao.update(account);
    }

    public void delete(Account account){
        accountDao.delete(account);
    }

    public Account getById(int id){
        return accountDao.getById(id);
    }
}
