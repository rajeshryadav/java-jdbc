package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcPersistance {

    public static void save(String dynamicQuery){

        try {

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "root");
            Statement sta = connection.createStatement();
            System.out.println(dynamicQuery);
            int x = sta.executeUpdate(dynamicQuery);
            connection.close();
        }catch (Exception e){

            System.out.println("exception");
        }

    }

    public void update(){

    }
    public void read(){

    }
    public void delete(){

    }

}
