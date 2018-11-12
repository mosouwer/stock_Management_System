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
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Mosouwer Jamil
 */
public class Update extends HttpServlet {

    


   

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         response.setContentType("text/html");
            PrintWriter out=response.getWriter();
            
            String inumb=request.getParameter("itemno");
            String amt=request.getParameter("price");
            int inum=Integer.valueOf(inumb);
            int prc=Integer.valueOf(amt);
            
           
            try{
                Class.forName("com.mysql.jdbc.Driver");  
                Connection con=DriverManager.getConnection(  
                        "jdbc:mysql://localhost:3306/mysql","root","");  
               
                 PreparedStatement ps=con.prepareStatement("update stocks set rate=? where itemno=?");  
                ps.setInt(1,prc);
                ps.setInt(2,inum);
                ps.executeUpdate();
                 request.getRequestDispatcher("update.html").include(request,response);
            out.print("<script>window.alert('Updated');</script>");
            
            }
               
            catch(Exception ex)
            {
                
                
            }
    }



}
