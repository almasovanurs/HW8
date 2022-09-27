package peaksoft.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    // реализуйте настройку соеденения с БД

    public static final String url ="jdbc:postgresql://localhost:5432/postgres";
    public static final String user = "postgres";
    public static final String password = "Nursuluu11";

    public static Connection connect(){
        Connection conn = null;
        try{
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to db successfully");
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return conn;

    }
}
