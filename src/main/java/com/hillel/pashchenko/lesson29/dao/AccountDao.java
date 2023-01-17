package com.hillel.pashchenko.lesson29.dao;

import com.hillel.pashchenko.lesson29.entity.Account;

public interface AccountDao {

    void save(Account account);

    void update(Account account);

    void delete(Account account);

    Account getById(int id);

    void checkAccount(Account account);

}
