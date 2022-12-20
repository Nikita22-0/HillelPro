package com.hillel.pashchenko.lesson28.service;

import com.hillel.pashchenko.lesson28.entity.Status;
import com.hillel.pashchenko.lesson28.util.Database;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StatusService {
    private String STATUS_QUERY_GET_ALL = "SELECT * FROM statuses";
    private String STATUS_QUERY_SAVE = "INSERT INTO statuses (alias, description) VALUES (?,?)";
    private String STATUS_QUERY_UPDATE = "UPDATE statuses SET alias = ?, description = ? WHERE id = ? OR alias = ? " +
            "OR description = ?";
    private String STATUS_QUERY_DELETE = "DELETE FROM statuses WHERE id =? OR alias = ? OR description = ?";

    public List<Status> getAll() {
        List<Status> statuses = new ArrayList<>();
        try (Connection connection = Database.getConnection();
             Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(STATUS_QUERY_GET_ALL);
            while (resultSet.next()) {
                connection.setAutoCommit(false);
                Status status = new Status();
                status.setId(resultSet.getInt("id"));
                status.setAlias(resultSet.getString("alias"));
                status.setDescription(resultSet.getString("description"));
                statuses.add(status);
            }
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return statuses;
    }

    public void save(Status status) {
        try (Connection connection = Database.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(STATUS_QUERY_SAVE)) {
            connection.setAutoCommit(false);
            preparedStatement.setString(1, status.getAlias());
            preparedStatement.setString(2, status.getDescription());
            preparedStatement.execute();
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update(Status status) {
        try (Connection connection = Database.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(STATUS_QUERY_UPDATE)) {
            connection.setAutoCommit(false);
            preparedStatement.setString(1, status.getAlias());
            preparedStatement.setString(2, status.getDescription());
            preparedStatement.setInt(3, status.getId());
            preparedStatement.setString(4, status.getAlias());
            preparedStatement.setString(5, status.getDescription());
            preparedStatement.execute();
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delete(Status status) {
        try (Connection connection = Database.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(STATUS_QUERY_DELETE)) {
            connection.setAutoCommit(false);
            preparedStatement.setInt(1, status.getId());
            preparedStatement.setString(2, status.getAlias());
            preparedStatement.setString(3, status.getDescription());
            preparedStatement.execute();
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
