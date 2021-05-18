import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class PostgreSQLJDBC {
   public static void main( String args[] ) {
      Connection c = null;
      Statement stmt = null;
      try {
         Class.forName("org.postgresql.Driver");
         // DriverManager.register(new org.postgresql.Driver());
         c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/testdb", "postgres", "What5432");
         System.out.println("Connection established successfully");
         stmt = c.createStatement();
         String sql = "CREATE TABLE COMPANY " +
            "(ID INT PRIMARY KEY NOT NULL," +
            " NAME TEXT NOT NULL, " +
            " AGE INT NOT NULL, " +
            " ADDRESS CHAR(50), " +
            " SALARY REAL)";
            
            String s1 = "INSERT INTO COMPANY (ID,NAME,AGE,ADDRESS,SALARY) VALUES (321, 'Teddy', 23, 'Norway', 20000.00);";
            stmt.close();
         PreparedStatement ps = c.prepareStatement(s1);
         ps.executeUpdate();
         ps.close();
         c.close();
      } catch ( Exception e ) {
         System.err.println( e.getClass().getName()+": "+ e.getMessage() );
         System.exit(0);
      }
      System.out.println("Table created successfully");
   }
}