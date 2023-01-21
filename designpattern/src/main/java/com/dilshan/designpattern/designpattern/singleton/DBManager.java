package com.dilshan.designpattern.designpattern.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author dilshanboteju
 */
public class DBManager {

    private static volatile DBManager dbManager;
    private static volatile Connection connection;

    private DBManager() {
        if (dbManager != null) {
            throw new RuntimeException("Use getDBManager Method");
        }

    }

    public static DBManager getDbManager() {

        if (dbManager == null) {
            synchronized (DBManager.class) {
                if (dbManager == null) {
                    dbManager = new DBManager();
                }
            }
        }

        return dbManager;
    }

    public Connection getConnection(){

        if (connection == null){
            synchronized (DBManager.class){
                if (connection == null){
                    String url = "jdbc:derby:memory:sample;create=true";
                    try {
                        connection = DriverManager.getConnection(url);
                    } catch (SQLException throwables) {
                        throwables.printStackTrace();
                    }
                }
            }

        }

        return connection;
    }
}
