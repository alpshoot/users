package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String URL = "jdbc:mysql://localhost:3306/mydbtest";
    private static final String userName = "root";
    private static final String userPassword = "Volzskaya281982@";
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, userName, userPassword);
    }
}
