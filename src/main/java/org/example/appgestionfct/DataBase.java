package org.example.appgestionfct;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBase {
    private static final String DATABASE_URL = "jdbc:mariadb://localhost:3306/proy3tex";
    private static final String DATABASE_USER = "root";
    private static final String DATABASE_PASSWORD = "1234";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DATABASE_URL, DATABASE_USER, DATABASE_PASSWORD);
    }
}
