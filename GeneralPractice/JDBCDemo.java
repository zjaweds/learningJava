import java.sql.*;

class JDBCDemo {
	public static void main(String[] args)  {
	String url   = "jdbc:oracle:thin:system/191Shahi@dbHost:1521:orcl";
	String userName="system";
	String password="191Shahi";
	
	//String driver = "jdbc:ucanaccess://C:\\Users\\Dr. Khalid Raza\\Desktop\\JavaLab\\DataFile.xls";
	String driver="oracle.jdbc.driver.OracleDriver";
  try {   
    //Step1: Loading a class
	Class.forName(driver); 
  


	//Step 2: Establishing a connection
	Connection con = DriverManager.getConnection(url,userName, password); 
  
// Step3: Creating a Statement Object
	Statement s = con.createStatement();
	
	//Executing SQL commands
	s.execute("insert into Students values('Sana',25)");  
	s.execute("insert into Students values('Javed',24)");
	s.execute("select age from Students");
	
	//Step 4: Handling a ResultSet
	ResultSet rs = s.getResultSet(); 
  
	if (rs == null) 
		System.out.println("No Data");
	while (rs.next()){   
		System.out.println("Table data: " +rs.getString(1) );
	}
	s.close();
	con.close();
  } catch (Exception err) { 
    System.out.println("ERROR: " + err); }
 }
 }