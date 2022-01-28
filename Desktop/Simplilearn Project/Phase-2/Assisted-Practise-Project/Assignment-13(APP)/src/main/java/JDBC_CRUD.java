import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBC_CRUD {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
  
   	 Class.forName("com.mysql.cj.jdbc.Driver");

   	 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcoperation","root","123456");
   	 if(con!=null) {
   		 System.out.println("connection is established with the DB");
   	 }
   	 else {
   		 System.out.println("pls chck the connection statement");
   	 }

   	 Scanner  sc=new Scanner(System.in);
   	 System.out.println("enter the sid value");
   	 int sid=sc.nextInt();
   	 System.out.println("enter the sname value");
   	 String sname=sc.next();
   	 //create
   	 String sql="insert into Student values(?,?)";
   	 PreparedStatement ps=con.prepareStatement(sql);
   	 ps.setInt(1, sid);
   	 ps.setString(2, sname);
   	 //update
   	 int i=ps.executeUpdate();
   	 System.out.println(i);
   	 if(i>0) {
   		 System.out.println("insertion successfull");
   	 }
   	 else {
   		 System.out.println("not inserted ");
   	 }
   	 //delete
     String sq="delete table from student set values(?)";
     ps =con.prepareStatement(sq);
     System.out.println("Deletion Sucessful");
     ps.execute();
    
    
}
}

