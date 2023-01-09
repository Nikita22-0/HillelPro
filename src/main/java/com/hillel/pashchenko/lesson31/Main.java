package com.hillel.pashchenko.lesson31;

import com.hillel.pashchenko.lesson31.entity.Account;
import com.hillel.pashchenko.lesson31.entity.Client;
import com.hillel.pashchenko.lesson31.entity.Status;
import com.hillel.pashchenko.lesson31.service.StatusService;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        final StatusService statusService = new StatusService();
        final Client client = new Client();
        final Status status = new Status();
        final Account account = new Account();
        final HashSet<Status> statuses = new HashSet<>();
        final HashSet<Client> clients = new HashSet<>();
        client.setName("Alice");
        client.setEmail("alice@mail.com");
        client.setPhone(501235648);
        client.setAbout("client Alice");
        client.setAge(22);
        account.setClientId(1);
        account.setNumber("8328773113113528");
        account.setValue(100000.5);
        account.setClient(client);
        client.setAccount(account);
        status.setAlias("STANDARD");
        status.setDescription("Standard access");
        statuses.add(status);
        client.setStatusIds(statuses);
        client.setStatuses(statuses);
        clients.add(client);
        status.setClients(clients);
        status.setClient(client);
        statusService.save(status);
    }
}
