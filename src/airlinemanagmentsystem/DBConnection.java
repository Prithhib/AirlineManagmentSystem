package airlinemanagmentsystem;

import java.sql.*;

public class DBConnection {
    Connection c;
    Statement s;
    public DBConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); //1st step: register the driver
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinemanagementsystem", "root", "1234"); //2nd step: creat the connection string
            s = c.createStatement(); //3rd step: creat the statement
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}