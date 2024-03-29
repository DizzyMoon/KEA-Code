package com.example.webshopdat22v2.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {

    private static Connection conn;

    public static Connection getConnection(String db_url, String uid, String pwd) {

        if (conn != null) return conn;
        try {
            Connection conn = DriverManager.getConnection(db_url, uid, pwd);
        } catch (SQLException e) {
            System.out.println("Couldn't connect to db");
            e.printStackTrace();
        }
        return conn;
    }
}
