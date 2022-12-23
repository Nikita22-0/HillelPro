package com.hillel.pashchenko.lesson28.service;

import com.hillel.pashchenko.lesson28.entity.Account;
import com.hillel.pashchenko.lesson28.entity.Client;
import com.hillel.pashchenko.lesson28.util.Database;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AccountService {
    private String ACCOUNT_QUERY_GET_ALL = "SELECT * FROM accounts";
    private String ACCOUNT_QUERY_SAVE = "INSERT INTO accounts (client_id, number, value) VALUES (?,?,?)";
    private String ACCOUNT_QUERY_UPDATE = "UPDATE accounts SET client_id = ?, number = ?, value = ? WHERE id = ? " +
            "OR client_id = ? OR number = ? OR value = ?";
    private String ACCOUNT_QUERY_DELETE = "DELETE FROM accounts WHERE id = ? OR client_id = ? OR number = ? " +
            "OR value = ?";


    public List<Account> getAll() {
        List<Account> accounts = new ArrayList<>();
        try (Connection connection = Database.getConnection();
             Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(ACCOUNT_QUERY_GET_ALL);
            while (resultSet.next()) {
                connection.setAutoCommit(false);
                final Account account = new Account();
                account.setId(resultSet.getInt("id"));
                account.setClient_id(resultSet.getInt("client_id"));
                account.setNumber(resultSet.getString("number"));
                account.setValue(resultSet.getDouble("value"));
                accounts.add(account);
            }
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return accounts;
    }

    public void save(Account account) {
        try (Connection connection = Database.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(ACCOUNT_QUERY_SAVE)) {
            connection.setAutoCommit(false);
            preparedStatement.setInt(1, account.getClient_id());
            preparedStatement.setString(2, account.getNumber());
            preparedStatement.setDouble(3, account.getValue());
            preparedStatement.execute();
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update(Account account) {
        try (Connection connection = Database.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(ACCOUNT_QUERY_UPDATE)) {
            connection.setAutoCommit(false);
            preparedStatement.setInt(1, account.getClient_id());
            preparedStatement.setString(2, account.getNumber());
            preparedStatement.setDouble(3, account.getValue());
            preparedStatement.setInt(4, account.getId());
            preparedStatement.setInt(5, account.getClient_id());
            preparedStatement.setString(6, account.getNumber());
            preparedStatement.setDouble(7, account.getValue());
            preparedStatement.execute();
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delete(Account account) {
        try (Connection connection = Database.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(ACCOUNT_QUERY_DELETE)) {
            connection.setAutoCommit(false);
            preparedStatement.setInt(1, account.getId());
            preparedStatement.setInt(2, account.getClient_id());
            preparedStatement.setString(3, account.getNumber());
            preparedStatement.setDouble(4, account.getValue());
            preparedStatement.execute();
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Account getAccountByNumber(Account account) {
        try (Connection connection = Database.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("SELECT number FROM accounts WHERE value > ?")) {
            connection.setAutoCommit(false);
            preparedStatement.setDouble(1, account.getValue());
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                System.out.println("Account: Number - " + resultSet.getString("number"));
            }
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return account;
    }
    public Account getClientByClientId(Account account) {
        try (Connection connection = Database.getConnection();
             Statement statement = connection.createStatement()) {
            connection.setAutoCommit(false);
            ResultSet resultSet = statement.executeQuery(
                    "SELECT * FROM clients c INNER JOIN accounts ac ON clients.id = accounts.client_id");
            while (resultSet.next()){
                System.out.println("Client: " +
                        "id - " + resultSet.getInt("id") +
                        ", name - " + resultSet.getString("name") +
                        ", email - " + resultSet.getString("email") +
                        ", phone - " + resultSet.getInt("phone") +
                        ", about - " + resultSet.getString("about") +
                        ", age - " + resultSet.getInt("age"));
            }
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return account;
    }
}
