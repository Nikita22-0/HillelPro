package com.hillel.pashchenko.lesson29.service;

import com.hillel.pashchenko.lesson29.dao.StatusDao;
import com.hillel.pashchenko.lesson29.dao.StatusDaoImpl;
import com.hillel.pashchenko.lesson29.entity.Status;

public class StatusService {

    private final StatusDao statusDao = new StatusDaoImpl();

    public void save(Status status){
        statusDao.save(status);
    }

    public void update(Status status){
        statusDao.update(status);
    }

    public void delete(Status status){
        statusDao.delete(status);
    }

    public Status getById(int id){
        return statusDao.getById(id);
    }
}
