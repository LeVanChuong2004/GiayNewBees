package com.raven.service;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectSqlService {
     public static final String HOSTNAME = "localhost";
    public static final String PORT = "1433";
    public static final String DBNAME = "DBNewBees";
    public static final String USERNAME = "sa";
    public static final String PASSWORD = "123456";

    public Statement ConnectSql() {
        // Create a variable for the connection string.
        String connectionUrl = "jdbc:sqlserver://" + HOSTNAME + ":" + PORT + ";"
                + "databaseName=" + DBNAME + ";encrypt=true;trustservercertificate=true;";
        try {
            Connection conn;
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(connectionUrl, USERNAME, PASSWORD);
            Statement stmt = conn.createStatement();
            return stmt;
        } // Handle any errors that may have occurred.
        catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

//    public static void main(String[] args) throws SQLException {
//        Connection conn = getConnection();
//        DatabaseMetaData dbmt = conn.getMetaData();
//        System.out.println(dbmt.getDriverName());
//        System.out.println(dbmt.getDatabaseProductName());
//        System.out.println(dbmt.getDatabaseProductVersion());
//    }
}