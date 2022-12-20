package com.hillel.pashchenko.lesson28;

import com.hillel.pashchenko.lesson28.entity.Account;
import com.hillel.pashchenko.lesson28.entity.Client;
import com.hillel.pashchenko.lesson28.entity.Status;
import com.hillel.pashchenko.lesson28.service.AccountService;
import com.hillel.pashchenko.lesson28.service.ClientService;
import com.hillel.pashchenko.lesson28.service.StatusService;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        final ClientService clientService = new ClientService();
        final Client client = new Client();
//        client.setName("Jim");
//        client.setEmail("jim@mail.com");
//        client.setPhone(509785315);
//        client.setAbout("client Jim");
//        client.setAge(26);
//        client.setId(29);
//        clientService.save(client);
//        clientService.update(client);
//        clientService.delete(client);
//        clientService.alterAgeInClients(client);
        List<Client> clients = clientService.getAll();
        clients.forEach(System.out::println);

        final StatusService statusService = new StatusService();
        final Status status = new Status();
//        status.setAlias("NORMAL");
//        status.setDescription("Normal accept");
//        statusService.save(status);
//        statusService.update(status);
//        statusService.delete(status);
//        List<Status> statuses = statusService.getAll();
//        statuses.forEach(System.out::println);

        final AccountService accountService = new AccountService();
        final Account account = new Account();
//        account.setId(19);
//        account.setClient_id(19);
//        account.setNumber("4682647982514894");
//        account.setValue(1500.22);
//        accountService.update(account);
//        List<Account> accounts = accountService.getAll();
//        accounts.forEach(System.out::println);
//        client.setPhone(501235648);
//        clientService.getClientByPhone(client);
//
//        account.setValue(10000.0);
//        accountService.getAccountByNumber(account);
//
//        accountService.getClientByClient_id(account);

        clientService.getClientByAge(client);

    }
}
