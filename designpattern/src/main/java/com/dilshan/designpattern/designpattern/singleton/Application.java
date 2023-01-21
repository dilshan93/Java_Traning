package com.dilshan.designpattern.designpattern.singleton;

import java.sql.Connection;

/**
 * @author dilshanboteju
 */
public class Application {

    public static void main(String[] args) {

        long start,end;

        DBManager dbManager = DBManager.getDbManager();
       // System.out.println(dbManager);

        start = System.currentTimeMillis();
        Connection connection = dbManager.getConnection();
        end = System.currentTimeMillis();

        System.out.println(end-start);

        DBManager dbManager1 = DBManager.getDbManager();
        //System.out.println(dbManager1);

        start = System.currentTimeMillis();
        Connection connection1 = dbManager1.getConnection();
        end = System.currentTimeMillis();

        System.out.println(end-start);


    }
}
