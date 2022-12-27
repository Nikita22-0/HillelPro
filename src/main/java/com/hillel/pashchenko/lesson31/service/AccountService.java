package com.hillel.pashchenko.lesson31.service;

import com.hillel.pashchenko.lesson31.dao.AccountDao;
import com.hillel.pashchenko.lesson31.entity.Account;

public class AccountService {
    private final AccountDao accountDao = new AccountDao();

    public void save(Account account){
        accountDao.save(account);
    }

    public void update(Account account){
        accountDao.update(account);
    }

    public void delete(Account account){
        accountDao.delete(account);
    }
}
