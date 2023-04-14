package Tutorials.com.tutorials.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author - rohit
 * @project - Java DSA
 * @package - Tutorials.com.tutorials.JDBC
 * @created_on - April 14-2023
 */
public class JdbcConnection {

    static Connection connection;
    public static Connection create() throws ClassNotFoundException, SQLException {
        // Load Driver
        Class.forName("com.mysql.jdbc.Driver");

        //Connect Create
        String user = "root";
        String password = "root";
        String url = "jdbc:mysql://localhost:3306/root";
        connection = DriverManager.getConnection(url, user, password);
        return connection;
    }
}
