/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Mosouwer Jamil
 */
public class crud extends HttpServlet {

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        Connection con=null;
        PrintWriter out=response.getWriter();
        String uname=request.getParameter("username");
        String fname=request.getParameter("userpass");
        String adminpass=request.getParameter("adminpass");
        
        if(adminpass.equals("password123"))
        {
              try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhos  t:3306/mysql","root","");
            PreparedStatement ps=con.prepareStatement("insert into id values(?,?)");
            ps.setString(1,uname);
            ps.setString(2,fname);
            
            ps.executeUpdate();
         request.getRequestDispatcher("registerpage.html").include(request,response);
            out.print("<script>window.alert('User Registered !');</script>");
            
        }
        
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
        finally{
           try{
               con.close();
           }
           
           catch(Exception e)
           {
               e.printStackTrace();
           }
        }
        }
        
        else
        {
            
            request.getRequestDispatcher("registerpage.html").include(request,response);
            out.print("<script>window.alert('Contact Administrator');</script>");
            
        }   
        
      
        
    }

   

}
