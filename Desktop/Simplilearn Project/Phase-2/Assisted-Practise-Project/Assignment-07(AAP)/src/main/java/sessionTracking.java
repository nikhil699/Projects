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
@WebServlet("/sessionTracking")
public class sessionTracking extends HttpServlet 
{
        private static final long serialVersionUID = 1L;
  
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
               
                
             String userId = request.getParameter("userid");
             response.sendRedirect("dashboard?userid=" + userId);  
                
        }
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            // TODO Auto-generated method stub
            doGet(request, response);
    }

}

