package src;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class sql {
    Connection connection;
    Statement statement;

    public sql(){
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem","root","Srushti26@");
            statement = connection.createStatement();


        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
