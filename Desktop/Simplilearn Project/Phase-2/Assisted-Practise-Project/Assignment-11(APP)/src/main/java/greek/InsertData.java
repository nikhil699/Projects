package greek;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
	@WebServlet("/InsertData")
	public class InsertData  extends HttpServlet {
	    private static final long serialVersionUID = 1L;
	  
	    protected void doPost(HttpServletRequest request, 
	HttpServletResponse response)
	        throws ServletException, IOException
	    {
	        try {
	  
	        	String dbDriver = "com.mysql.cj.jdbc.Driver";
	  	        String dbURL = "jdbc:mysql:// localhost:3306/";
	  	        
	  	        String dbName = "demo";
	  	        String dbUsername = "root";
	  	        String dbPassword = "12345";
	  	  
	  	        Class.forName(dbDriver);
	  	        Connection con = DriverManager.getConnection(dbURL + dbName,
	  	                                                     dbUsername, 
	  	                                                     dbPassword);
	          // con   = DatabaseConnection.initializeDatabase();
	  
	          
	            PreparedStatement st = con
	                   .prepareStatement("insert into demo values(?, ?, ?, ?)");
	  
	          
	            st.setInt(1, Integer.valueOf(request.getParameter("eid")));
	  
	            // Same for second parameter
	            st.setString(2, request.getParameter("ename"));
	            
	            // Same for second parameter
	            st.setString(3, request.getParameter("email"));
	            
	            // Same for second parameter
	            st.setString(4, request.getParameter("address"));
	            
	            // Execute the insert command using executeUpdate()
	            // to make changes in database
	            st.executeUpdate();
	  
	            // Close all the connections
	            st.close();
	            con.close();
	  
	            // Get a writer pointer 
	            // to display the successful result
	            PrintWriter out = response.getWriter();
	            out.println("<html><body><b>Successfully Inserted"
	                        + "</b></body></html>");
	        }
	        catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}