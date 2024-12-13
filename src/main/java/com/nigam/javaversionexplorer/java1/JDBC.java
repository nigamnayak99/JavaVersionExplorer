package com.nigam.javaversionexplorer.java1;

import java.sql.*;

public class JDBC {
    public static void main(String[] args) throws SQLException {
        String sql = "SELECT * FROM public.employee";
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String username = "postgres";
        String password = "root";

        Connection connection = DriverManager.getConnection(url, username, password);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        resultSet.next();
        System.out.println(resultSet.getString(2));
    }
}
