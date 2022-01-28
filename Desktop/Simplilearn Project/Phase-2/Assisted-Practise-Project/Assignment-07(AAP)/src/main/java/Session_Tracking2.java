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
@WebServlet("/Session_Tracking2")
public class Session_Tracking2 extends HttpServlet {
        private static final long serialVersionUID = 1L;
  
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
             
        
            PrintWriter out = response.getWriter();
            out.println("<html><body>");
            
            String userId = request.getParameter("userid");
            if (userId == null ) {
                out.println("No UserId<br>");
            } else {
                out.println("UserId obtained from URL Rewriting:" + userId + "<br>");
            }
            out.println("</body></html>");

        }

        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
             
                doGet(request, response);
        }
}