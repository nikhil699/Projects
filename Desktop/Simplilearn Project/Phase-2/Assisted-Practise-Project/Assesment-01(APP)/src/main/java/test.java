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
@WebServlet("/GetHandler")
public class test extends HttpServlet {
        private static final long serialVersionUID = 1L;
       

/**
* @see HttpServlet#HttpServlet()
*/


 /**
  * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
  */
 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         // TODO Auto-generated method stub
           PrintWriter out = response.getWriter();
             out.println("<html><body>");
             
             String name = request.getParameter("name");
             String address = request.getParameter("address");
             out.println("Name=" + name + "<br>Address=" + address);
             out.println("</body></html>");
 }


}