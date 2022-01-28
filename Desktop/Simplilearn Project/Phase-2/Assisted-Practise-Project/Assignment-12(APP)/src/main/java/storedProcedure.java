import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class storedProcedure {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
   	 //step1: Register the Driver class
   	 Class.forName("com.mysql.cj.jdbc.Driver");

   	 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcoperation","root","12345");
   	 if(con!=null) {
   		 System.out.println("connection is established with the DB");
   	 }
   	 else {
   		 System.out.println("pls chck the connection statement");
   	 }
   	 
   	 Statement stmt=con.createStatement();
   	 

   	 String sql="insert  into Student values(101,'karthik')";
   	 int record=stmt.executeUpdate(sql); //1
   	 if(record>0) {
   		 System.out.println(record + "rows inserted ");
   	 }
   	 else {
   		 System.out.println("insertion failed");
   	 }
   	 
   	 
   	 
    }

