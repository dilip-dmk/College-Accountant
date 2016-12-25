package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException; 

/**
@author Dilip Pc
 */

public class userDao {
    
   private static Connection connection = null;
    
    public static Connection getConnection() {
     if (connection != null)
            return connection;
     else {
            
         try {
                String dbUrl = "jdbc:mysql://localhost/collegeaccountant";
                Class.forName("com.mysql.jdbc.Driver");
                connection=DriverManager.getConnection(dbUrl,"root","1234");
                System.out.println("Connection Established");
                
            } catch (ClassNotFoundException e) {
                
                System.out.println(e.getMessage());
                e.printStackTrace();
            } catch (SQLException e) {
                 System.out.println(e.getMessage());
                e.printStackTrace();
            } 
            return connection;
        }       
         
    }
    
}
