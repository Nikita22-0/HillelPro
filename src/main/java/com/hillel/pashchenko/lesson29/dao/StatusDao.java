package com.hillel.pashchenko.lesson29.dao;


import com.hillel.pashchenko.lesson29.entity.Status;

public interface StatusDao {

    void save(Status status);

    void update(Status status);

    void delete(Status status);

    Status getById(int id);

    void checkStatus(Status status);
}
