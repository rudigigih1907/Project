/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datamanagerbuku.database;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author rudigigihprabowo
 */
public class ConnectionHelper {
    private static final String DATABASE_NAME = "perpustakaan2";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    private static final String URL = "jdbc:mysql://localhost:3306/" + DATABASE_NAME;
 
    public static Connection getConnection() throws SQLException {
        DriverManager.registerDriver(new Driver());
        Connection connection = (Connection) DriverManager.getConnection(URL, USER, PASSWORD);
        return connection;
    }
}
