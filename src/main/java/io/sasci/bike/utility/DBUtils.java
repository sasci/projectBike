package io.sasci.bike.utility;

import java.sql.*;

import static io.sasci.bike.utility.ConfigUtils.getValue;


public class DBUtils {

    private static final String url = String.format(getValue("dbUrl"), getValue("env"));
    private static final String username = getValue("dbUser");
    private static final String password = getValue("dbPassword");

    public String selectExactStringValue(String query, String queryParam, String columnName) {
        String result = new String();

        try (
             Connection connection = DriverManager.getConnection(url, username, password);
             PreparedStatement statement = connection.prepareStatement(query);) {
            statement.setString(1, queryParam);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                result = resultSet.getString(columnName);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return result;
    }

    public void queryExecute(String query,String queryParam)  {
        try (Connection connection = DriverManager.getConnection(url, username, password);
             PreparedStatement statement = connection.prepareStatement(query);) {
            statement.setString(1, queryParam);
            statement.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

}