package com.hillel.pashchenko.lesson29.service;

import com.hillel.pashchenko.lesson29.dao.StatusDao;
import com.hillel.pashchenko.lesson29.dao.StatusDaoImpl;
import com.hillel.pashchenko.lesson29.entity.Status;
import org.apache.log4j.Logger;

public class StatusService {

    private final StatusDao statusDao = new StatusDaoImpl();
    private final Logger logger = Logger.getLogger(StatusService.class);

    public void save(Status status) {
        if (status == null){
            logger.error("Status is null");
        }
        statusDao.save(status);
    }

    public void update(Status status) {
        if (status == null){
            logger.error("Status is null");
        }
        statusDao.update(status);
    }

    public void delete(Status status) {
        if (status == null){
            logger.error("Status is null");
        }
        statusDao.delete(status);
    }

    public Status getById(int id) {
        return statusDao.getById(id);
    }

    public void checkStatus(Status status) {
        logger.debug(status.toString());
    }
}
