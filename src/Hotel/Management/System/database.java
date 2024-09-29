package Hotel.Management.System;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class database {
    Connection connection;

    Statement statement;

    public database(){
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelNP", "root", "Nidhi1807");
            statement = connection.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
