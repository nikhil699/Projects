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
	@WebServlet("/NameServlet")
	public class generic  extends HttpServlet {
	    private static final long serialVersionUID = 1L;
	  
	    protected void doget(HttpServletRequest request, 
	HttpServletResponse response)
	        throws ServletException, IOException
	    {
	        try 
	        {
	           
	                String fname = request.getParameter("fname");
	                String lname = request.getParameter("lname");
	                
	                PrintWriter out = response.getWriter();
	            out.println("<html><body>");
	            out.println("Your full name is " + fname + " " + lname);
	            out.println("</body></html>");
	        }
	        catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
}