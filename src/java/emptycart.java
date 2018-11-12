

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class emptycart extends HttpServlet {

 
   
    

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            try{
                 Class.forName("com.mysql.jdbc.Driver");  
                Connection c=DriverManager.getConnection(  
                        "jdbc:mysql://localhost:3306/mysql","root","");  
                        PreparedStatement p=c.prepareStatement("delete from cart");
                        p.executeUpdate();
                        response.sendRedirect("Cart.jsp");
                        
            }
            catch(Exception ex)
            {
                
            }
        
    }



}
