package org.example.appgestionfct;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBase {
    public Connection connectDatabase() {
        Connection conexion = null;
        try {
            // Cambia estos valores por los de tu base de datos
            String url = "jdbc:mariadb://localhost:3306/";
            String user = "root";
            String password = "1234";

            conexion = DriverManager.getConnection(url, user, password);
            if (conexion != null) {
                System.out.println("Conexión establecida");
            }
        } catch (SQLException e) {
            System.out.println("Error al conectar con la base de datos");
            e.printStackTrace();
        }
        return conexion;
    }
}
