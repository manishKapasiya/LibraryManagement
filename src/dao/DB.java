package library.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB {
    public static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    public static final String JDBC_URL = "jdbc:mysql://localhost:3306/library";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "root";

    public static Connection getConnection(){
        Connection con=null;
        try{
            Class.forName(JDBC_DRIVER);
            con=DriverManager.getConnection(JDBC_URL,USERNAME,PASSWORD);
        }catch(Exception e){System.out.println(e);}
        return con;
    }

}
