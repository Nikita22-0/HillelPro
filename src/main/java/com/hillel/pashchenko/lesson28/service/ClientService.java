package com.hillel.pashchenko.lesson28.service;

import com.hillel.pashchenko.lesson28.entity.Account;
import com.hillel.pashchenko.lesson28.entity.Client;
import com.hillel.pashchenko.lesson28.util.Database;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClientService {
    private String CLIENT_QUERY_GET_ALL = "SELECT * FROM clients";
    private String CLIENT_QUERY_SAVE = "INSERT INTO clients (name, email, phone, about, age) VALUES (?,?,?,?,?)";
    private String CLIENT_QUERY_UPDATE =
            "UPDATE clients SET name = ?, email = ?, phone = ?, about = ?, age = ? WHERE id = ? " +
            "OR name = ? OR email = ? OR phone = ? OR about = ? OR age = ?";
    private String CLIENT_QUERY_DELETE = "DELETE FROM clients WHERE id = ? OR name = ? OR email = ? OR phone = ? " +
            "OR about = ? OR age = ?";
    private String alter_age = "UPDATE clients SET age = ? WHERE id = ?";


    public List<Client> getAll() {
        List<Client> clients = new ArrayList<>();
        try (Connection connection = Database.getConnection();
             Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(CLIENT_QUERY_GET_ALL);
            while (resultSet.next()) {
                connection.setAutoCommit(false);
                Client client = new Client();
                client.setId(resultSet.getInt("id"));
                client.setName(resultSet.getString("name"));
                client.setEmail(resultSet.getString("email"));
                client.setPhone(resultSet.getInt("phone"));
                client.setAbout(resultSet.getString("about"));
                client.setAge(resultSet.getInt("age"));
                clients.add(client);
            }
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return clients;
    }

    public void save(Client client) {
        try (Connection connection = Database.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(CLIENT_QUERY_SAVE)) {
            connection.setAutoCommit(false);
            preparedStatement.setString(1, client.getName());
            preparedStatement.setString(2, client.getEmail());
            preparedStatement.setInt(3, client.getPhone());
            preparedStatement.setString(4, client.getAbout());
            preparedStatement.setInt(5, client.getAge());
            preparedStatement.execute();
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update(Client client) {
        try (Connection connection = Database.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(CLIENT_QUERY_UPDATE)) {
            connection.setAutoCommit(false);
            preparedStatement.setString(1, client.getName());
            preparedStatement.setString(2, client.getEmail());
            preparedStatement.setInt(3, client.getPhone());
            preparedStatement.setString(4, client.getAbout());
            preparedStatement.setInt(5, client.getAge());
            preparedStatement.setInt(6, client.getId());
            preparedStatement.setString(7, client.getName());
            preparedStatement.setString(8, client.getEmail());
            preparedStatement.setInt(9, client.getPhone());
            preparedStatement.setString(10, client.getAbout());
            preparedStatement.setInt(11, client.getAge());
            preparedStatement.execute();
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delete(Client client) {
        try (Connection connection = Database.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(CLIENT_QUERY_DELETE)) {
            connection.setAutoCommit(false);
            preparedStatement.setString(1, client.getName());
            preparedStatement.setString(2, client.getName());
            preparedStatement.setString(3, client.getEmail());
            preparedStatement.setInt(4, client.getPhone());
            preparedStatement.setString(5, client.getAbout());
            preparedStatement.setInt(6, client.getAge());
            preparedStatement.execute();
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void getClientByPhone(Client client) {
        try (Connection connection = Database.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM clients WHERE phone = ?")) {
            connection.setAutoCommit(false);
            preparedStatement.setInt(1, client.getPhone());
            ResultSet resultSet = preparedStatement.executeQuery();
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
    }

    public void getClientByAge(Client client) {
        try (Connection connection = Database.getConnection();
             Statement statement = connection.createStatement()) {
            connection.setAutoCommit(false);
            ResultSet resultSet = statement.executeQuery("SELECT c.name, c.email, s.alias FROM clients c " +
                    "FULL JOIN client_status cs ON c.id = cs.client_id " +
                    "FULL JOIN statuses s ON cs.status_id = s.id WHERE age > 18");
            while (resultSet.next()){
                System.out.println("Client: " +
                        "name - " + resultSet.getString("name") +
                        ", email - " + resultSet.getString("email") +
                        ", alias - " + resultSet.getString("alias"));
            }
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void alterTable(){
        try (Connection connection = Database.getConnection();
             Statement statement = connection.createStatement()){
            connection.setAutoCommit(false);
            statement.execute("ALTER TABLE clients ADD age int");
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void alterAgeInClients(Client client) {
        try (Connection connection = Database.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(alter_age)) {
            connection.setAutoCommit(false);
            preparedStatement.setInt(1, client.getAge());
            preparedStatement.setInt(2, client.getId());
            preparedStatement.execute();
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
