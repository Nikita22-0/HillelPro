package com.hillel.pashchenko.lesson29;

import com.hillel.pashchenko.lesson29.entity.Account;
import com.hillel.pashchenko.lesson29.entity.Client;
import com.hillel.pashchenko.lesson29.entity.Status;
import com.hillel.pashchenko.lesson29.service.AccountService;
import com.hillel.pashchenko.lesson29.service.ClientService;
import com.hillel.pashchenko.lesson29.service.StatusService;
import com.hillel.pashchenko.lesson29.util.HibernateConfig;

public class Main {
    public static void main(String[] args) {
        final ClientService clientService = new ClientService();
        final Client client = new Client();
        client.setName("Greg");
        client.setEmail("greg@mail.com");
        client.setPhone(634785126);
        client.setAbout("client Greg");
        client.setAge(20);
        client.setId(30);
//        clientService.save(client);
//        clientService.checkClient(client);

//        final Client getById = clientService.getById(10);
//        System.out.println(getById);
//        final Client byPhone = clientService.getByPhone(501235648);
//        System.out.println(byPhone);

        final AccountService accountService = new AccountService();
        final Account account = new Account();
        account.setClientId(20);
        account.setNumber("5468953768165183");
        account.setValue(22000.4);
        account.setId(19);
//        final Account byId = accountService.getById(10);
//        System.out.println(byId);
//        accountService.checkAccount(account);

        final StatusService statusService = new StatusService();
        final Status status = new Status();
        status.setAlias("NORMALS");
        status.setDescription("NormalS access");
        status.setId(5);
//        statusService.save(status);
        statusService.checkStatus(status);
        HibernateConfig.getSessionFactory();
    }
}
