package com.hillel.pashchenko.lesson31.service;

import com.hillel.pashchenko.lesson31.dao.StatusDao;
import com.hillel.pashchenko.lesson31.entity.Status;

public class StatusService {

    private final StatusDao statusDao = new StatusDao();

    public void save(Status status){
        statusDao.save(status);
    }

    public void update(Status status){
        statusDao.update(status);
    }

    public void delete(Status status){
        statusDao.delete(status);
    }
}
