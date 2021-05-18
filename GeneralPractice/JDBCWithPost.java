import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCWithPost{
public static void main(String[] args) {
    try{        
        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/testdb","postgres","What5432");
        System.out.println("Connection established");
        String sql = "create table labviva"+"(id int, "+"name text,"+"age int)";
        
        Statement stmt = con.createStatement(sql);
        stmt.executeUpdate(sql);
        stmt.close();
    }
        catch(Exception e){
            System.out.println(e);
        }        
    }
}
