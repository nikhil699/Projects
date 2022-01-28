package loginligout;
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
import javax.servlet.http.HttpSession;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
@WebServlet("/logoutservlet")
public class logoutservlet extends HttpServlet {
        private static final long serialVersionUID = 1L;
  
    public logoutservlet() {
        super();
      
    }

        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
              
                HttpSession session=request.getSession();  
                session.invalidate();           
                PrintWriter out = response.getWriter();
                out.println("<html><body>");
            out.println("Logged out of session.<br>");
            out.println("</body></html>");
        }

        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
              
                doGet(request, response);
        }

}
